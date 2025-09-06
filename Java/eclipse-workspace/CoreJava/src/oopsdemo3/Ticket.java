package oopsdemo3;

/**
 * Author :Jetty.Srikar
 * Date :Sep 5, 2025
 * Time :10:00:01 AM
 *project : projCoreJava
 */

public class Ticket {
	private String movieName;
    private double price;
    
    public void showTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Price: " + price);
    }

	public Ticket(String movieName, double price) {
		this.movieName = movieName;
		this.price = price;
	}
    

}
