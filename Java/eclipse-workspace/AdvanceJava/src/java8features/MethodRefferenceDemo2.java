package java8features;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :3:16:28 PM
 *project : projAdvanceJava
 */
@FunctionalInterface
interface IDemo
{
	void sum(int  x,int y);
}

class Calculation
{
	void addition(int  a,int b)
	{
		System.out.println("The Addition is : "+(a+b));
	}
}

public class MethodRefferenceDemo2 {

	public static void main(String[] args) {
		Calculation c1=new Calculation();

		//using Lambda expressions
		IDemo d1=(a,b)->System.out.println("The Addition is : "+(a+b));
		d1.sum(10, 45);

		//Using Method reference to call instance method
		IDemo d2=c1::addition;
		d2.sum(200,150);

	}

}
