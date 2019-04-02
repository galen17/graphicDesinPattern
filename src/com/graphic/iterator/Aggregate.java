package com.graphic.iterator;

/*
 * 充当抽象的集合，只定义返回一个迭代器的方法
 * 
 * 创建一个迭代器
 */
public interface Aggregate {
	public abstract Iterator iterator();
}
