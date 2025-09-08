package collectionsdemo;

/**
 * Author :Jetty.Srikar
 * Date :Sep 8, 2025
 * Time :4:39:33 PM
 *project : projCoreJava
 */

public class BankingGenericsDemo {
	
	public static void main(String[] args) {
		
		//Using Generic Class for different types of account numbers
		BankAccount<Integer> savingsAcc = new BankAccount<Integer>("Allice", 123456);
		BankAccount<String> currentAcc = new BankAccount<String>("Bob", "CURR-3423");
		BankAccount<Long> loanAcc = new BankAccount<Long>("cHARLIE", 9867654321L);
		
		 System.out.println("=== Account Details ===");
	        savingsAcc.displayAccountInfo();
	        currentAcc.displayAccountInfo();
	        loanAcc.displayAccountInfo();

	        System.out.println("\n=== Transactions ===");
	        // Using Generic Method for different transaction types
	        BankingUtil.printTransaction("Deposit of $5000");
	        BankingUtil.printTransaction(2500.75);  // double amount
	        BankingUtil.printTransaction(12345);    // transaction ID
		
	}

}
