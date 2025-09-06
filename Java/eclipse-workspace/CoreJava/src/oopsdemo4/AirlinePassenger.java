package oopsdemo4;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :10:17:56 AM
 *project : projCoreJava
 */

public class AirlinePassenger implements Passenger {
	
	private String name;
	private String passportNumber;
	private String email;
	private String phone;
	
	public AirlinePassenger(String name, String passportNumber, String email, String phone) {
		this.name = name;
		this.passportNumber = passportNumber;
		this.email = email;
		this.phone = phone;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public String getPassportNumber() {
		
		return passportNumber;
	}

	@Override
	public String getContactInfo() {
		
		return "Email: " +email + ", Phone: "+ phone;
	}
}