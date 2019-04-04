package com.graphic.adapter;
/**
 * 原类，原本提供的服务。100伏
 * @author hp
 *
 */
public class Banner {
	private String string;
	
	public Banner(String string) {
		this.string=string;
	}
	
	public void showWithParen() {
		System.out.println("("+string+")");
	}
	
	public void showWithAster() {
		System.out.println("*"+string+"*");
	}
}
