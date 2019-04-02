package com.graphic.iterator;

/**
 * 迭代器iterator模式中充当元素的角色，即集合中的元素
 * 
 * @author hp
 *
 */
public class Book {
	private String name;
	public Book(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
