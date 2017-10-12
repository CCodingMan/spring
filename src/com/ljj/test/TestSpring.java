package com.ljj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ljj.pojo.Category;
import com.ljj.pojo.Product;
import com.ljj.service.ProductService;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Category c = (Category) context.getBean("c");
//        System.out.println(c.getName());
        
//        Product p = (Product) context.getBean("p");
//        System.out.println(p.getName());
//        System.out.println(p.getCategory().getName());
		
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
        
	}

}
