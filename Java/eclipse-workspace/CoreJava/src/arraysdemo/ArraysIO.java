package arraysdemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 2, 2025
 * Time :10:01:46 AM
 *project : projCoreJava
 *
 *Program to enter elements into array and display it
 */

public class ArraysIO {

	public static void main(String[] args) {
		int[] marks= {78,56,44,55,23,45,56,23,56,11,1,23,54};  	//declare and initilize Array
		
		System.out.println("*************** Array of Marks *****************");
		for (int i = 0; i<marks.length;i++) {
			System.out.println(marks[i]+"\t");
		}
		
		System.out.println();
		System.out.println("The size of array is :"+marks.length);
		System.out.println("The first element of array is :"+marks[0]);
		System.out.println("The last element of array is :"+marks[marks.length-1]);
		
		//Enter the values at run time
		System.out.println("***************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of students");
		int n = sc.nextInt();
		
		int marks2[]=new int[n];    //declare array and allocation
		
		System.out.println("Enter marks2 Array elements");
		for (int i = 0; i < n; i++) {
			marks2[i]=sc.nextInt();
		}
		
		System.out.println("*************** Array of Marks 2 *****************");
		for (int i = 0; i<marks2.length;i++) {
			System.out.println(marks2[i]+"\t");
		}
		
		System.out.println();
		System.out.println("Display marks array without Loop");
		System.out.println(Arrays.toString(marks2));
		
		sc.close();

	}

}
