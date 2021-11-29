package com.cx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenxiang
 * @create 2021-09-13 11:40
 */
@Configuration
@ComponentScan("com.cx")
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}

}
