package com.han.onlineshopping.vo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	private String productName;
	private String shortDescription;
	private boolean show;
	@ManyToOne
	Category category;
	@ManyToOne
	Shop shop;
}
