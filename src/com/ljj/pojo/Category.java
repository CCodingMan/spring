package com.ljj.pojo;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("c")
public class Category {
    private int id;
    
    //ע��
//    private String name;
    
    private String name = "�ֻ�";
    
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
    
    
}
