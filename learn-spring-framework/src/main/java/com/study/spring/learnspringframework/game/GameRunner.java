package com.study.spring.learnspringframework.game;

public class GameRunner {
	
	private SuperContraGame game;
	
	public GameRunner(SuperContraGame game) {
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
