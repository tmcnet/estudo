package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		return new PacmanGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		return new GameRunner(game);
	}
}
