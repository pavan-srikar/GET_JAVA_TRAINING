package controlflow;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :11:47:22 AM
 *project : projCoreJava
 *
 *Ternary Operator : It is a conditional Operator used in place of If-Else for Simple condition.
 * It Takes 3 Operands
 * Syntax: variable = condition ? expr1 : expr2
 *
 * Program to find Max of 2 Numbers
 */

public class TurnaryDemo {

	public static void main(String[] args) {
		int a=110, b=220, max;
		
		System.out.println("First Number : "+a);
		System.out.println("Second Number : "+b);
		
		// Ternary Operator
		String msg = (a>b) ? "A is greater" : "B is greater";
		System.out.println(msg);
		
		max = (a>b)? a:b;
		System.out.println("max of 2 numbers is "+max);
		

	}

}
