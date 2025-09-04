package oopsdemo1;

/**
 * Author :Jetty.Srikar
 * Date :Sep 3, 2025
 * Time :12:16:05 PM
 *project : projCoreJava
 */

public class CandidateTest {

	public static void main(String[] args) {
		
		//Invoke parameterized constructor
		Candidate cd1=new Candidate(101, "James", 5000.00f);
		Candidate cd2=new Candidate(102, "dfgs", 6000.00f);
		
		cd1.calculateDA();
		cd1.display();
		
		cd2.calculateDA();
		cd2.display();

	}

}
