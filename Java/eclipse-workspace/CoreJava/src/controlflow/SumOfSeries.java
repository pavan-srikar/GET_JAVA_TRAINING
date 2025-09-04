package controlflow;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :12:39:37 PM
 *project : projCoreJava
 *
 *Program to find Sum of Series . 1+2+3+ .....+n
 */

public class SumOfSeries {

	public static void main(String[] args) {
		int i=1,n,sum=0;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Value of N : ");
		n=scanner.nextInt();
		scanner.close();
		
		while( i < n ) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println("The sum of Series of : "+sum);

	}

}
