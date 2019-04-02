package com.graphic.iterator;

/**
 * 充当具体的集合类，集合中存放相应的元素
 * 继承抽象集合类
 * 能不用数组实现的。
 * @author hp
 *
 */
public class BookShelf implements Aggregate {

	private Book[] books;
	private int last=0;
	public BookShelf(int maxsize) {
		this.books=new Book[maxsize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last]= book;
		last++;
	}
	public int getLength() {
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
