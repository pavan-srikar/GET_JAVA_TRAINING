package controlflow;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :10:22:28 AM
 *project : projCoreJava
 *
 *program to find greatest of 3 numbers
 */

public class Greatest3 {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int num1, num2 , num3;

        System.out.println("Enter 3 Numbers :");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        
        if (num1 > num2 && num1 > num3) {
        	System.out.println(num1+" is gratest");
			
		}
        else if (num2 > num3) {
			System.out.println(num2+" is the greatest");
		}
        else if (num1 == num2 && num2 == num3) {
			System.out.println("all numbers are equal");
		}
        
        else {
        	System.out.println(num3+" is the greatest");

		}
        sc.close();

	}

}
