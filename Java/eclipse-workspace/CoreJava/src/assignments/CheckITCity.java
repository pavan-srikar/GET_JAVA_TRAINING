package assignments;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 8, 2025
 * Time :9:28:54 AM
 *project : projCoreJava
 */

public class CheckITCity {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter your city: ");
        String city = sc.nextLine().trim().toLowerCase();

        switch(city) {
            case "delhi":
            case "mumbai":
            case "kolkatta":
            case "bangalore":
            case "chennai":
            case "hyderabad":
                System.out.println("The city is an IT City.");
                break;
            default:
                System.out.println("The city is NOT an IT City.");}

	}

}
