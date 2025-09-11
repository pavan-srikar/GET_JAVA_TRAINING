package assignments;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :9:16:37 AM
 *project : projCoreJava
 */

public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your score (0-100): ");
		int score = sc.nextInt();

		if (score >= 90 && score <= 100)
			System.out.println("Your grade is A.");

		else if (score >= 80)
			System.out.println("Your grade is B.");

		else if (score >= 70)
			System.out.println("Your grade is C.");

		else if (score >= 60)
			System.out.println("Your grade is D.");

		else
			System.out.println("Your grade is F.");
		sc.close();

	}

}
