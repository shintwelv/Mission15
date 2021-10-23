package com.springboot.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.biz.model.ArticleVO;
import com.springboot.biz.repository.ArticleRepository;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleRepository dao;
	
	@Override
	public void insert(ArticleVO vo) {
		dao.insert(vo);
	}
	
	@Override
	public void update(ArticleVO vo) {
		dao.update(vo);
	}
	
	@Override
	public void delete(ArticleVO vo) {
		dao.delete(vo);
	}
	
	@Override
	public ArticleVO select(ArticleVO vo) {
		return dao.select(vo);
	}
}
