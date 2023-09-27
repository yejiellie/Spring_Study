package com.study.spring.learnspringframework.game;

import com.study.spring.learnspringframework.GamingConsole;

public class PacmanGame implements GamingConsole{
	
	public void up() {
		System.out.println("일어나");
	}
	public void down() {
		System.out.println("앉아");
	}
	public void left() {
		System.out.println("왼쪽");
	}
	public void right() {
		System.out.println("오른쪽");
	}
}
