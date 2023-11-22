package com.lcmd.orm.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_category")
public class Category {
	
	@Id
	private int CId;
	private String Title;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product> productlist = new ArrayList<>();
	
	public Category(int cId, String title) {
		super();
		CId = cId;
		Title = title;
	}


	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<Product> getProductlist() {
		return productlist;
	}


	public void setProductlist(List<Product> productlist) {
		this.productlist = productlist;
	}


	public int getCId() {
		return CId;
	}


	public void setCId(int cId) {
		CId = cId;
	}


	public String getTitle() {
		return Title;
	}


	public void setTitle(String title) {
		Title = title;
	}
	
	

}
