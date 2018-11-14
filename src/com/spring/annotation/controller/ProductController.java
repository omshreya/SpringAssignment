package com.spring.annotation.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.annotation.dao.*;
import com.spring.annotation.pojo.*;

@Controller
@RequestMapping(value= "/") 
public class ProductController 
{
	
	 @RequestMapping(value="/viewproduct",method=RequestMethod.GET)  
	 public ModelAndView viewproduct()
	 {  
		 List<Product> list=ProductDao.getProducts(); 
		 return new ModelAndView("viewproduct","list",list);  
	 }  
}
