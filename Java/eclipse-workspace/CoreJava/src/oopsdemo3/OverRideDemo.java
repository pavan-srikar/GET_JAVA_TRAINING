package oopsdemo3;

/**
 * Author :Jetty.Srikar
 * Date :Sep 4, 2025
 * Time :3:24:21 PM
 *project : projCoreJava
 */
class Bank{
	private String name;

	public Bank(String name) {
		this.name = name;
	}


int getRateOfInterest(){
      return 0;
  }
  void display(){
      System.out.println("Welcome to "+name+" Bank");
  }
}

class SBI extends Bank{

	public SBI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {
		return 5;
	}	
}

class ICICI extends Bank{
	ICICI(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() {	//Method Overridden in child class
		return 7;
	}
		
}

class Axis extends Bank{

	public Axis(String name) {
		super(name);
	}

	@Override
	int getRateOfInterest() { 	//Method Overridden in child class
		
		return 6;
	}
		
}


public class OverRideDemo {

	public static void main(String[] args) {
		
		SBI sbiBank = new SBI("SBI");
		ICICI iciciBank = new ICICI("ICICI");
		Axis axisBank = new Axis("Axis");
		
		sbiBank.display();
		System.out.println("The Interest Rate of SBI is : "+sbiBank.getRateOfInterest()); 	// invoke overriden
		
		iciciBank.display();
		System.out.println("The Interest Rate of ICICI is : "+iciciBank.getRateOfInterest());
		
		axisBank.display();
		System.out.println("The Interest Rate of Axis is : "+axisBank.getRateOfInterest());


	}

}