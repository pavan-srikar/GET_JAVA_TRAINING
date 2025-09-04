package oopsdemo3;

/**
 * Author :Jetty.Srikar
 * Date :Sep 4, 2025
 * Time :3:02:07 PM
 *project : projCoreJava
 */

public class OverLoadDemo2 {

	public static void main(String[] args) {
		 Outlet oulet=new Outlet();
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name & price
	        oulet.addProduct("T-Shirt",20.50);
	         //oulet.addProduct("T-Shirt",20.50);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name ,price, quantity
	        oulet.addProduct("Jeans",45.50,100);
	        System.out.println("---------------------------------------------");
	        //Add Product with only Name , price, quantity, category
	        oulet.addProduct("Sneakers",75.50,30,"Footwear");
	        System.out.println("---------------------------------------------");

	}

}
