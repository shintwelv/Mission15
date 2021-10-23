package com.springboot.biz.impl;

import com.springboot.biz.model.ArticleVO;

public interface ArticleService {

	void insert(ArticleVO vo);

	void update(ArticleVO vo);

	void delete(ArticleVO vo);

	ArticleVO select(ArticleVO vo);

}