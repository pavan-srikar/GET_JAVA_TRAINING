package java8features;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :3:40:15 PM
 *project : projAdvanceJava
 */

public class Car implements Vehicle {
	private String brand;
	Car(String brand){
		this.brand=brand;
	}
	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String speedUp() {
		return "Car is speading up";
	}

	@Override
	public String slowDown() {
		return "car is slowing down";
	}

}
