package exceptiondemo;

import java.io.IOException;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :3:50:34 PM
 *project : projCoreJava
 */

public class ThrowsExample {
	
	void myMethod(int a) throws IOException, ArithmeticException
	{
		if(a==1)
			throw new IOException("IO Exception Occured");
		else
			throw new ArithmeticException("Arithmetic Exception");
	}

	public static void main(String[] args) {

		ThrowsExample t = new ThrowsExample();
		
		try {
			t.myMethod(1);
		}
		catch(Exception ex)
		{
			System.err.println(ex);
		}

	}

}

