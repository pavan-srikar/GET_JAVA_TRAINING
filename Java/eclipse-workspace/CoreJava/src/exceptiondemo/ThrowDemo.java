package exceptiondemo;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :3:28:36 PM
 *project : projCoreJava
 */

public class ThrowDemo {
	public static void hello(int a) {
		if(a==0)
			throw new ArithmeticException("pass non zero values"); //exception thrown manually
		else
			System.out.println(a);
	}

	public static void main(String[] args) {

		hello(100);
		hello(0);

	}

}
