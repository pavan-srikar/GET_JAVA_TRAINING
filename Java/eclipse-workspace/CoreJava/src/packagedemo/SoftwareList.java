package packagedemo;

import com.coforge.training.oracleproj.Database;
import com.wipro.training.microsoftproj.OperatingSystem;

/**
 * Author :Jetty.Srikar
 * Date :Sep 8, 2025
 * Time :10:37:56 AM
 *project : projCoreJava
 */

public class SoftwareList {
	public static void main(String[] args) {
		OperatingSystem op1= new OperatingSystem();
		Database db1= new Database();
		
		System.out.println("*********************** List of Operating System from MicroSoft ***********************");
		op1.listSoftware();
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		System.out.println("*********************** List of Operating System from MicroSoft ***********************");
		db1.printSoftware();
		
	}
}
