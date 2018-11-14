package com.spring.annotation.pojo;

public class Product 
{
	private int product_Id;
	private String product_Name;
	private String category;
	
	public Product() 
	{
	}

	public Product(int product_Id, String product_Name, String category) 
	{
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.category = category;
	}

	public int getProduct_Id() 
	{
		return product_Id;
	}

	public void setProduct_Id(int product_Id) 
	{
		this.product_Id = product_Id;
	}

	public String getProduct_Name() 
	{
		return product_Name;
	}

	public void setProduct_Name(String product_Name) 
	{
		this.product_Name = product_Name;
	}

	public String getCategory() 
	{
		return category;
	}

	public void setCategory(String category) 
	{
		this.category = category;
	}

	@Override
	public String toString() 
	{
		return "Product [product_Id=" + product_Id + ", product_Name=" + product_Name + ", category=" + category + "]";
	}
	
	
}
