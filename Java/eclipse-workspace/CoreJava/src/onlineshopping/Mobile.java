package onlineshopping;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :12:02:12 PM
 *project : projCoreJava
 */

//Concrete Product - Mobile
class Mobile extends Product {
	public Mobile(String productName, double price) {
		super(productName, price);
	}

	@Override
	public void showProductDetails() {
		System.out.println("Mobile: " + productName + " | Price: ₹" + price);
	}
}
