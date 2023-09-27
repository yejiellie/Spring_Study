package com.study.spring.learnspringframework;

import com.study.spring.learnspringframework.game.GameRunner;
import com.study.spring.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {

//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();	//1. 객체 생성
		var gameRunner = new GameRunner(game);
		//2. 객체 생성 + 의존성 연결
		//GamingConsole은 GameRunner 클래스의 의존성이다
		gameRunner.run();
		
		
	}

}
