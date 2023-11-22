package com.lcmd.orm.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_product")
public class Product {

	@Id
	private int PId;
	private String productName;
	
	@ManyToMany(mappedBy = "productlist")
	private List<Category> categorylist = new ArrayList<>();
	
	
	public Product(int pId, String productName) {
		super();
		PId = pId;
		this.productName = productName;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<Category> getCategorylist() {
		return categorylist;
	}


	public void setCategorylist(List<Category> categorylist) {
		this.categorylist = categorylist;
	}


	public int getPId() {
		return PId;
	}


	public void setPId(int pId) {
		PId = pId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
	
}
