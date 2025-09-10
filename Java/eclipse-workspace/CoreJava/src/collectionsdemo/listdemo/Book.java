package collectionsdemo.listdemo;

/**
 * Author :Jetty.Srikar
 * Date :Sep 9, 2025
 * Time :11:35:50 AM
 *project : projCoreJava
 */

public class Book {
	
	//attributes
	private int id;
    private String name,author,publisher;
    private int quantity;
    
    //constructors
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getQuantity() {
		return quantity;
	}
	
	
    
    
}
