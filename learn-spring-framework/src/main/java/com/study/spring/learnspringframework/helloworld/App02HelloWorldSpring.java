package com.study.spring.learnspringframework.helloworld;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.spring.learnspringframework.game.GameRunner;
import com.study.spring.learnspringframework.game.PacmanGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		try (
		var context = 
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person5Qualifier"));
		
		
			//System.out.println
	//		Arrays.stream(context.getBeanDefinitionNames())
	//			.forEach(System.out::println);
		}
	}
 
}
