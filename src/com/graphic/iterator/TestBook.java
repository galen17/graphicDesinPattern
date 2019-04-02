package com.graphic.iterator;
/**
 * 迭代器的应用可以吧集合和集合的遍历解耦然后复用
 * 
 * 1、假设这里BookShelf还有多个子类，多个子类的迭代器就是同一个
 * 	BookShelf的多个子类就可以可以互相替换，而迭代器方面的代码不用管。
 * 2、可以使得序列类型的数据结构的遍历行为与被遍历的对象分离，即我们无需关心该序列的底层结构是什么样子的。只要拿到这个对象,使用迭代器就可以遍历这个对象的内部
 * 
 * 3、采用ArrayList对随机访问比较快，而for循环中的get()方法，采用的即是随机访问的方法，因此在ArrayList里，for循环较快
	采用LinkedList则是顺序访问比较快，iterator中的next()方法，采用的即是顺序访问的方法，因此在LinkedList里，使用iterator较快
	从数据结构角度分析,for循环适合访问顺序结构,可以根据下标快速获取指定元素.而Iterator 适合访问链式结构,因为迭代器是通过next()和Pre()来定位的.可以访问没有顺序的集合.
	而使用 Iterator 的好处在于可以使用相同方式去遍历集合中元素，而不用考虑集合类的内部实现（只要它实现了 java.lang.Iterable 接口），
	如果使用 Iterator 来遍历集合中元素，一旦不再使用 List 转而使用 Set 来组织数据，那遍历元素的代码不用做任何修改，如果使用 for 来遍历，
	那所有遍历此集合的算法都得做相应调整,因为List有序,Set无序,结构不同,他们的访问算法也不一样.（还是说明了一点遍历和集合本身分离了）
	
 * @author hp
 */
public class TestBook {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("1、Around"));
		bookShelf.appendBook(new Book("2、Bible"));
		bookShelf.appendBook(new Book("3、Cinderella"));
		bookShelf.appendBook(new Book("4、Daddy-Long-legs"));
		Iterator it=bookShelf.iterator();
		while(it.hasNext()){
			Book book=(Book) it.next();
			System.out.println(book.getName());
		}
	}
}
