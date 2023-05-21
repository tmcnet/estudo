package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*
 * Record was released in JDK 16, and it basically create all those public accessor methods, 
 * constructor, equals and hashcode, toString, automatically.
 */
record Person (String name, int age, Address address) {}

record Address (String firstLine, String city) {}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Thiago";
	}
	
	@Bean
	public int age() {
		return 40;
	}
	
	@Bean
	public Person person() {
		return new Person("Barbara", 39, new Address("Rua Ernesto de Castro, 235", "São Paulo") );
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Rua Ernesto de Castro, 235", "São Paulo");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Avenida Fagundes Filho, 443", "São Paulo");
	}
}
