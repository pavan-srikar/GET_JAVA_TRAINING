package oopsdemo4;

/**
 * Author :Jetty.Srikar
 * Date :Sep 6, 2025
 * Time :11:34:02 AM
 *project : projCoreJava
 */

public class College {
	String name;
	int id;
	String universty;
	String course;
	public College(String name, int id, String universty, String course) {
		this.name = name;
		this.id = id;
		this.universty = universty;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getUniversty() {
		return universty;
	}
	public String getCourse() {
		return course;
	}
	
	
}
