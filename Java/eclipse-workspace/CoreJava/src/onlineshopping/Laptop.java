package onlineshopping;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :12:01:44 PM
 *project : projCoreJava
 */

//Concrete Product - Laptop
class Laptop extends Product {
 public Laptop(String productName, double price) {
     super(productName, price);
 }

 @Override
 public void showProductDetails() {
     System.out.println("Laptop: " + productName + " | Price: ₹" + price);
 }
}
