package oopsdemo3;

import java.util.concurrent.CountDownLatch;

/**
 * Author :Jetty.Srikar
 * Date :Sep 5, 2025
 * Time :11:31:54 AM
 *project : projCoreJava
 */
class Count{

	private static int cnt; // static variable
	private int a;

	Count(){
		cnt++;
		a=100;
	}

	public static void display() {
		System.out.println("The number of Objects created : "+cnt);
		//a=a+10
	}
	public void print(){
		System.out.println("Instance Method Variable : "+a);
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		Count c1=new Count(); 
		Count c2=new Count(); 
		Count c3=new Count(); 
		Count c4=new Count(); 
		
		c1.print(); //Invokes Instance Methods
		
		Count.display();

	}

}
