package oopsdemo3;

/**
 * Author :Jetty.Srikar
 * Date :Sep 4, 2025
 * Time :4:10:34 PM
 *project : projCoreJava
 */

public class Account {
	private String name;
    protected double balance;
	

    //Using constructors to assign/initialize values for properties
    //Hence not using setter() methods
    public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}


	public String getName() {
		return name;
	}


	public double getBalance() {
		return balance;
	}

	//final methods cannot be overwritten
    final void deposit(double amt){
        balance+=amt;
        System.out.println("Depositing : "+amt);
    }
    public void withdraw(double amt){
        balance-=amt;
        System.out.println("Withdrawing :"+amt);
    }
    
}
