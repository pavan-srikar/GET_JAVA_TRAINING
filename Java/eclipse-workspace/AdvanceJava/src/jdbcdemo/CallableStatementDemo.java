package jdbcdemo;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :12:06:42 PM
 *project : projAdvanceJava
 */

public class CallableStatementDemo {

	public static void main(String[] args) {
		try {
			Skills s=new Skills();
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter Candiate id to get his skills");
			
			System.out.println("Enter Candidate Id : ");
			int id=scan.nextInt();
			
			s.getSkils(id);
			scan.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
