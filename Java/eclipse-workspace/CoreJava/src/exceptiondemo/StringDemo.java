package exceptiondemo;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :2:46:29 PM
 *project : projCoreJava
 */

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello World";
		String s2=null;
		try
		{
			System.out.println(s1.length());
			System.out.println(s2.length());
		}
		catch(Exception a)
		{
			System.err.println("Exception occured :"+a);
			//throw new NullPointerException("String is Empty");
		}

	}

}
