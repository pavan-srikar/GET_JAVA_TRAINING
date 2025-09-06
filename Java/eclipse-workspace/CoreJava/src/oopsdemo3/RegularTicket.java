package oopsdemo3;

/**
 * Author :Jetty.Srikar
 * Date :Sep 5, 2025
 * Time :10:00:53 AM
 *project : projCoreJava
 */

public class RegularTicket extends Ticket{
	private String seatNumber;


	public RegularTicket(String movieName, double price, String seatNumber) {
		super(movieName, price);
		this.seatNumber = seatNumber;
	}
	


	public void showSeat() {
	        System.out.println("Seat Number: " + seatNumber);
	    }
}


class PremiumTicket extends Ticket{
    private String loungeAccess;

   public PremiumTicket(String movieName, double price, String loungeAccess) {
	super(movieName, price);
	this.loungeAccess = loungeAccess;
   }
   
   
  public void showLoungeAccess() {
      System.out.println("Lounge Access: " + loungeAccess);
  }
   
   
}
