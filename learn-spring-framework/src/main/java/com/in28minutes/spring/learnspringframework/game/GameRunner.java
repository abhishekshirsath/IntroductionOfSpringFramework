package com.in28minutes.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	//@Autowired
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	
	@Autowired
	public void setGame(GamingConsole game) {
		System.out.println("Setter Injection");
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
