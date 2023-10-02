package com.study.spring.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//JDK 16버전부터 사용 가능한 기능
record Person (String name, int age, Address address) { };
record Address (String gu, String City) {}; 

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "김가가";
	}
	@Bean
	public int age() {
		return 15;
	}
	
	//레코드를 사용해서 빈 생성 게터세터등 모두 만들 수 있다
	@Bean
	public Person person() {
		return new Person("김나나",20,new Address("금천구","서울"));		
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());	
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		//name,age,address2
		return new Person(name, age, address3);
	}
	
	@Bean
	@Primary
	//NoUniqueBeanDefinitionException 에러가 발생한다
	//available: expected single matching bean but found 2: address2,address3
	//일치하는 단일 Bean이 있어야하지만 두개가 잡혀서 발생했다
	//이를 해결하기 위해서 @Primary 로 기본값을 정해서 해결할 수 있다
	public Person person4Parameters(String name, int age, Address address) {
		//name,age,address2
		return new Person(name, age, address); 
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		//name,age,address2
		return new Person(name, age, address); 
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("강서구", "서울");		
	}

	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("계양구", "인천");		
	}
	
}
