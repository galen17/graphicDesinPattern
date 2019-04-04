package com.graphic.adapter.useImp;

public class Client {
	public static void main(String[] args) {
		Print p= new PrintBanner("Hello");
		p.printStrong();
		p.printWeak();
	}
}
