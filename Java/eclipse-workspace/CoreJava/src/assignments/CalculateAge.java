package assignments;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 8, 2025
 * Time :9:25:37 AM
 *project : projCoreJava
 */

public class CalculateAge {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("You are " + age + " years old.");

	}

}
