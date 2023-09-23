package com.study.spring.learnspringframework;

import com.study.spring.learnspringframework.game.GameRunner;
import com.study.spring.learnspringframework.game.MarioGame;
import com.study.spring.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {

//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
		
		
	}

}
