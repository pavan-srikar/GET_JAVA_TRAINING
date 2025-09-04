package oopsdemo2;

/**
 * Author :Jetty.Srikar
 * Date :Sep 4, 2025
 * Time :10:10:23 AM
 *project : projCoreJava
 */

public class Staff {
	//Program to Demonstrate MultiLevel Inheritance


	private int staffId;
	private String name;
	protected float basic,hra;     //protected variables can be accessed in Child class


	public Staff(int staffId, String name, float basic) {
		this.staffId = staffId;
		this.name = name;
		this.basic = basic;
	}


	void getHRA() {
		hra=(basic*60)/100;
		System.out.println("HRA :"+hra);
	}
	void display() {
		System.out.println(staffId+" "+name+" "+basic);
	}
	void printSal() {
		System.out.println("Total Salary : "+(basic+hra));
	}

}



class Manager extends Staff{
	//Program to Demonstrate MultiLevel Inheritance


	 protected float da;
	    private float gross;
	    
	    
	    public Manager(int staffId, String name, float basic) {
			super(staffId, name, basic);

		}
	    
	    
		void getDA() {
	        da=(basic*60)/100;
	        System.out.println("Dearness Allowance : "+da);
	    }
	    void print() {
	        gross=basic+hra+da;
	        System.out.println("Total Salary of Manager : "+gross);
	    }
}

//Staff -> Manager -> Director - Multilevel Inheritance
class Director extends Manager{
	
	private float ta, gross;

	public Director(int staffId, String name, float basic) {
		super(staffId, name, basic);
		
	}
	void getTA() {
        ta=(basic*30)/100;
        System.out.println("Travelling Allowance : "+ta);
    }
    void print() {
        gross=basic+hra+da+ta;
        System.out.println("Total Salary of Director : "+gross);
    }
	
}