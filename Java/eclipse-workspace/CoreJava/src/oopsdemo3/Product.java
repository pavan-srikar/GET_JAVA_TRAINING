package oopsdemo3;

/**
 * Author :Jetty.Srikar
 * Date :Sep 5, 2025
 * Time :9:43:27 AM
 *project : projCoreJava
 */

public class Product {
	private String name;
	private double price;
	
	//Generate Constructors
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// generate getters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	void display() {
        System.out.println("********** Product Details ***************");
        System.out.println("Name : "+name);
        System.out.println("Price: "+price);
    
	}
	
}


class Book extends Product{
	
	private String author;

	public Book(String name, double price, String author) {
		super(name, price);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	void display() {
		super.display();
		System.out.println("Author : "+author);
	}
	
}

class Laptop extends Product{
	private String manufacturer;

	public Laptop(String name, double price, String manufacturer) {
		super(name, price);
		this.manufacturer = manufacturer;
	}
	public String getmanufacturer() {
		return manufacturer;
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("manufacturer : "+manufacturer);
	}
}

