package com.study.spring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.spring.learnspringframework.game.GameRunner;
import com.study.spring.learnspringframework.game.PacmanGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try ( var context = new AnnotationConfigApplicationContext
													(GamingConfiguration.class)) {
			
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}
	}
}
