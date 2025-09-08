package exceptiondemo;

/**
 * Author :Jetty.Srikar
 * Date :Sep 8, 2025
 * Time :9:57:01 AM
 *project : projCoreJava
 */

public class UserDefinedExceptionsDemo {
	public static void main(String[] args) {
		CheckingAccount ck1=new CheckingAccount(101);
		
		System.out.println("Depositing 500$");
		ck1.deposit(500);
		try {
			System.out.println("withdrawing 200$");
			ck1.withdraw(200);
			
			System.out.println("withdrawing 500$");
			ck1.withdraw(500);
		} catch (InSufficientFundsException e) {
			System.err.println("Sorry insufficent Balance :"+ ck1.getBalance());
			e.printStackTrace();
		}
		
		
	}
}
