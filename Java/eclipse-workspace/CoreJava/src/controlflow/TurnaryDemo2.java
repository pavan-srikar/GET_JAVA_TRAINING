package controlflow;

import java.util.Scanner;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :11:54:50 AM
 *project : projCoreJava
 *
 *Program to Check whether entered alphabet using Ternary Operator
 */

public class TurnaryDemo2 {

	public static void main(String[] args) {
		char myChar;
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter a Character :");
		myChar=scanner.next().charAt(0); // Take Single character Input

		// Ternary Operator
		String output=(myChar>='a' && myChar <='z') || (myChar>='A' && myChar <='Z') ? myChar+" is an Alphabet":myChar+" is not an alphabet";
		
		System.out.println(output);

	}

}
