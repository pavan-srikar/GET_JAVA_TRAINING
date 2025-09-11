package assignments;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :9:18:41 AM
 *project : projCoreJava
 */

public class StrongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = sc.nextLine();
		
		if (isStrong(password))
			System.out.println("Password strength: Strong.");
		else if (isMedium(password))
			System.out.println("Password strength: Medium.");
		else
			System.out.println("Password strength: Weak.");
		
		sc.close();
	}
	
	static boolean isStrong(String pass) {
		return pass.length() >= 8 && pass.matches(".*[A-Z].*") && pass.matches(".*[a-z].*") &&
				pass.matches(".*\\d.*") && pass.matches(".*[^a-zA-Z0-9].*");
	}
	
	static boolean isMedium(String pass) {
		return pass.length() >= 6 && pass.matches(".*[A-Z].*") && pass.matches(".*[a-z].*") &&
				pass.matches(".*\\d.*");

	}

}
