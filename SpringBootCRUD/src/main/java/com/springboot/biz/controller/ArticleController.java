package com.springboot.biz.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.biz.impl.ArticleService;
import com.springboot.biz.model.ArticleVO;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping(value = {"/", "goMain.do"})
	public String goMain() {
		return "index";
	}
	
	@RequestMapping(value = "insert.do")
	public String fwdInsertPage() {
		
		return "insert";
	}
	
	@RequestMapping(value = "insertProcess.do")
	public String insertProcess(ArticleVO vo) {
		articleService.insert(vo);
		
		return "insertSuccess";
	}
	
	@RequestMapping(value = "update.do")
	public String fwdUpdatePage(HttpServletRequest request) {
		ArticleVO article = articleService.select(vo);
	}
	
	
}
