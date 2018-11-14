package com.spring.annotation.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.spring.annotation.pojo.Product;

public class ProductDao 
{
	public static Connection connect() throws ClassNotFoundException, SQLException 
	{
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/sample";
		String userName = "root";
		String password = "password";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, userName, password);
		return conn;
	}
	
	public static List<Product> getProducts()
	{  
		ResultSet rs=null;
		Connection conn=null;
		Statement stmt=null;
		String sql2 = "select * from product";
		List<Product> productlist = new ArrayList<Product>();
		try
		{
			conn = connect();
			if(null != conn)
			{
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql2);
				while(rs.next())
				{
					Product product=new Product();
					product.setProduct_Id(rs.getInt("product_Id"));
					product.setProduct_Name(rs.getString("product_Name"));
					product.setCategory(rs.getString("category"));
					productlist.add(product);
				}
			}
		}
		catch(Exception ex)
		{
           ex.printStackTrace();
       }
		
		return productlist;
	}
}
