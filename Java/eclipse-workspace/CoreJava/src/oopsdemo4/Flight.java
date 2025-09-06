package oopsdemo4;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :10:06:57 AM
 *project : projCoreJava
 */

public interface Flight {
	//Flight Booking System using Interfaces

	String getFlightNumber();
		String getAirline();
		String getDeparture();
		String getArrival();
		double getPrice();
		void displayFlightDetails();
}

//Booking Interface
interface Booking {
	void bookFlight(Flight flight, Passenger passenger);
	void cancelBooking(String bookingId);
	void displayBookingDetails();
}

//Payment Interface
interface Payment {
	void processPayment(double amount);
	boolean isPaymentSuccessful();
	String getTransactionId();
}

//Passenger Interface
interface Passenger {
	String getName();
	String getPassportNumber();
	String getContactInfo();
}




