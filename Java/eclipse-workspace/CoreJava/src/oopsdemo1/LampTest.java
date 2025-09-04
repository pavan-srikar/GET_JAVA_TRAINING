package oopsdemo1;

/**
 * Author :Jetty.Srikar
 * Date :Sep 3, 2025
 * Time :10:33:27 AM
 *project : projCoreJava
 *
 *Java Program to implement instance class & main class in a Single file
 */
class Lamp{
	// stores the value for light
	// true if light is on
	// false if light is off
	
	boolean isOn;
	
	//method to turn on
	void turnOn() {
		isOn=true;
		System.out.println("Light On?"+isOn);
	}
	
	//method to turn off
		void turnOff() {
			isOn=false;
			System.out.println("Light On?"+isOn);
		}

}


public class LampTest {

	public static void main(String[] args) {
		// create objects led & halogen
		Lamp led=new Lamp();
		Lamp halogen =new Lamp();
		
		//switching on
		led.turnOn();
		halogen.turnOn();
		
		//switching off
		led.turnOff();
		halogen.turnOn();

	}

}
