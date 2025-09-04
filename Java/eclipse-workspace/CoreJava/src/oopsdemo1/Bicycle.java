package oopsdemo1;

/**
 * Author :Jetty.Srikar
 * Date :Sep 3, 2025
 * Time :10:44:20 AM
 *project : projCoreJava
 */

//define attributes, methods & Objects in a Single Main class
public class Bicycle {
	
	int gear;
	
	void applyBreak() {
		System.out.println("Applying BREAKS");
	}
	
	public void startCycling() {
		gear=gear+1;
		System.out.println("Cycling in gear no : "+gear);
	}
	
	
	
	

	public static void main(String[] args) {

		Bicycle sportsbicycle=new Bicycle();
		sportsbicycle.startCycling();
		sportsbicycle.applyBreak();
		sportsbicycle.startCycling();
		sportsbicycle.startCycling();
		sportsbicycle.startCycling();

	}

}
