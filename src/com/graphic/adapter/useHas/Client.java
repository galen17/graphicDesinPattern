package com.graphic.adapter.useHas;

/**
 * 充当调用者角色
 * @author hp
 */
public class Client {
	public static void main(String[] args) {
		Print p=new PrintBanner("Hello");
		p.printStrong();
		p.printWeak();
	}
}
