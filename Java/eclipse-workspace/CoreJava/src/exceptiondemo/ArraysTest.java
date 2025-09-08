package exceptiondemo;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :2:36:51 PM
 *project : projCoreJava
 */

public class ArraysTest {

	public static void main(String[] args) {
		/* Java program for General Exception Handling */


		String[] languages = {"C","C++","Java","Perl","Python"};

		try {
			for (int i = 0; i <= languages.length; i++) {
				System.out.println(languages[i]);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("In Finally Block");
		}
	}
}
