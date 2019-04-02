package com.graphic.iterator;

/**
 * 充当抽象的迭代器
 * 
 * @author hp
 */
public interface Iterator {
	//判断是否还有下一个
	public abstract boolean hasNext();
	//获得当前的下标的内容
	public abstract Object next();
}
