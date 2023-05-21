package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConfiguration;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			
			var gameRunner = context.getBean(GameRunner.class);
			gameRunner.run();
		}
	}
}
