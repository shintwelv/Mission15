package com.springboot.biz.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.springboot.biz.model.ArticleVO;

@Repository
public class ArticleRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(ArticleVO vo) {
		em.persist(vo);
	}
	
	public void update(ArticleVO vo) {
		em.merge(vo);
	}
	
	public void delete(ArticleVO vo) {
		em.remove(vo);
	}
	
	public ArticleVO select(ArticleVO vo) {
		return (ArticleVO) em.find(ArticleVO.class, vo.getArticle_id());
	}
}
