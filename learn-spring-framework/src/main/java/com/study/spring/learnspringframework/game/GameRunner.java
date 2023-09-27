package com.study.spring.learnspringframework.game;

import com.study.spring.learnspringframework.GamingConsole;

public class GameRunner {
	
	private GamingConsole game;
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Runnig game : " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	
	
	
}
