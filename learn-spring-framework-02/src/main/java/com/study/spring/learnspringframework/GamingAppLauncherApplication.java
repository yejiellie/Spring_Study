package com.study.spring.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.study.spring.learnspringframework.game.GameRunner;
import com.study.spring.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.study.spring.learnspringframework.game")
public class GamingAppLauncherApplication {
	
	public static void main(String[] args) {

		try ( var context = new AnnotationConfigApplicationContext
						(GamingAppLauncherApplication.class)) {
			
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();
		}
	}
}
