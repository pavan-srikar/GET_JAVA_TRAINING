package controlflow;

import java.util.Scanner;

/**
* Author :Karicheti.Snehith
* Date  :01-Sept-2025
* Time  :12:51:11 pm
* Project:CoreJava
*/

public class OddEvenDisplay {

	public static void main(String[] args) {
		System.out.println("Odd      Even");
		System.out.println("\n*****************");
		int i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.print(i+"\n");
			}
			else {
				System.out.print(i+"\t");
			}
			i++;
		}
	}

}
