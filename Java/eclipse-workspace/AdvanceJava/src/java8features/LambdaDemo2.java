package java8features;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :2:17:22 PM
 *project : projAdvanceJava
 */

public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericTest isEven=(n) -> (n%2)==0;
		NumericTest isNegetive = (n) ->(n<0);
		
		System.out.println("7 is Even Number :" +isEven.computeTest(7));
		System.out.println("-55 is Even Number :" +isNegetive.computeTest(-55));

		
		//boolean a=(n) -> (n%2==0); error - lambda expressions should be stored in instance of FI
		
		
		
		

	}

}
