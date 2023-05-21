package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
//		// 1: Launch a Spring Context
		try(var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			
			// 2: Configure the things that I want spring to manage (HelloWorldConfiguration - @Configuration)
			
			// 3: Get the Bean 'Name' managed by Spring Framework, by name
			System.out.println(context.getBean("name"));
			
			// 4: Get the Bean 'Age' managed by Spring Framework, by name
			System.out.println(context.getBean("age"));
			
			// 5: Get the Bean 'Person' managed by Spring Framework, by name
			System.out.println(context.getBean("person"));
			
			// 6: Get the Bean 'Address' managed by Spring Framework, by name
			System.out.println(context.getBean("address2"));
			
			// 8: Get the Bean 'person2MethodCall' managed by Spring Framework, by name
			System.out.println(context.getBean("person2MethodCall"));
			
			// 9: Get the Bean 'person2MethodCall' managed by Spring Framework, by name
			System.out.println(context.getBean("person3Parameters"));
			
			// 10: Get the Bean 'Person' managed by Spring Framework, by type 
			System.out.println(context.getBean(Person.class));
			
			// 11: Get the Bean 'Address' managed by Spring Framework, by type
			System.out.println(context.getBean(Address.class));
			
			// 12: Get the Bean 'Person5Qualifier' managed by Spring Framework, by name
			System.out.println(context.getBean("person5Qualifier"));
			
			
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}		
	}
}
