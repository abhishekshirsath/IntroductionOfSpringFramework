package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
	
	public void up() {
		System.out.println("PacmanGame UP");
	}
	
	public void down() {
		System.out.println("PacmanGame DOWN");
	}
	
	public void left() {
		System.out.println("PacmanGame LEFT");
	}
	
	public void right() {
		System.out.println("PacmanGame RIGHT");
	}

}
