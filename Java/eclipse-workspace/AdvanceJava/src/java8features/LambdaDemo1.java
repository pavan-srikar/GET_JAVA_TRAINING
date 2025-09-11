package java8features;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :12:55:07 PM
 *project : projAdvanceJava
 */
@FunctionalInterface
interface MyFI{
	public String SayHello(); //by default abstract
	//public string sayHello1();
}
public class LambdaDemo1 {

	public static void main(String[] args) {
		MyFI msg = () -> { return "Hello wrld";}; //lambda expression
		
		MyFI msg1 = () -> { return "Java 8 Features";};
		
		MyFI msg2 = () -> { return "Coforge";};
		
		MyFI msg3 =() -> {return "Coforge"+" "+"Technologies";};
		
		System.out.println(msg.SayHello());
		System.out.println(msg1.SayHello());
		System.out.println(msg2.SayHello());
		System.out.println(msg3.SayHello());


	}

}
