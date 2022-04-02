package org.mybatis.spring.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings("serial")
@XmlRootElement(name="category")
public class Category implements Serializable{

	private int id;
	private String name;
	private ArrayList<Product> products = new ArrayList<Product>();

	public int getId() {
		return id;
	}
	@XmlElement(name="categoryid")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@XmlElement(name="categoryname")
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", products="
				+ products + "]";
	}

	
	public Category() {
	}

	public Category(String name) {
		super();
		this.name = name;
	}
	
	
	
}
