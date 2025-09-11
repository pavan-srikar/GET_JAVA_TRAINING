package assignments;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :9:13:31 AM
 *project : projCoreJava
 */

public class Employee {
	private double salary;
	private int hoursPerDay;

	public void getInfo(double salary, int hoursPerDay) {
		this.salary = salary;
		this.hoursPerDay = hoursPerDay;
	}

	public void addSal() {
		if (salary < 500) {
			salary += 10;
		}
	}

	public void addWork() {
		if (hoursPerDay > 6) {
			salary += 5;
		}
	}

	public void printFinalSalary() {
		System.out.println("Final Salary: $" + salary);
	}
}
