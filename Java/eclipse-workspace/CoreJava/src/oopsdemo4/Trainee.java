package oopsdemo4;

/**
 * Author :Jetty.Srikar
 * Date :Sep 5, 2025
 * Time :12:49:33 PM
 *project : projCoreJava
 */

public abstract class Trainee {
	 private String name;
	   private String address;
	   private int number;
   
   
   public Trainee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

   	//public method declaration - must be overridden in the derived class
   public abstract double calculateMarks();

   //abstract method declaration - must be overridden in the derived class
   
   void show()
	{
		System.out.println("Display Marks for :" +this.name+ " "+this.address);
	}

   @Override
   public String toString() {
	return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
   }
   
}
