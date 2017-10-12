package com.ljj.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("p")
public class Product {
    private int id;
//    private String name;
    
    //注解
    private String name = "iphone";
    
//    @Resource(name="c")
    @Autowired
    private Category category;//@Resource(name="c")不需要写setter方法
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
    
}
