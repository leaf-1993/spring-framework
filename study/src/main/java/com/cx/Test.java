package com.cx;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author chenxiang
 * @create 2021-09-13 11:40
 */
@Configuration
@ComponentScan("com.cx")
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Test.class);
		PersonService bean = context.getBean(PersonService.class);
		System.out.println(bean.test());
		System.out.println(bean.test());
		System.out.println(bean.test());
		System.out.println(bean.test());
		System.out.println(bean.test());

		System.out.println(bean);
//		ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext();

	}

}
