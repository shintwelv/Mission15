package com.springboot.biz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "springboot_crud")
public class ArticleVO {
	@Id
	@GeneratedValue
	private int article_id;
	private String article_title;
	private String article_content;
}
