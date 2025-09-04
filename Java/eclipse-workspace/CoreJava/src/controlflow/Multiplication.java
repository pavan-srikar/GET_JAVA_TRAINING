package controlflow;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :3:09:17 PM
 *project : projCoreJava
 *
 * Program to display Multiplication Table of a number
 */

public class Multiplication {

	public static void main(String[] args) {
		int num,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextInt();
		sc.close();
		for(i=1;i<=10;i++) {
			System.out.println(num +" * "+i+" = "+num*i);
		}

	}

}
