package collectionsdemo.librarymc;

/**
 * Author :Jetty.Srikar
 * Date :Sep 9, 2025
 * Time :2:15:59 PM
 *project : projCoreJava
 */

public class Member {
	private int id;
    private String name;
    private String email;
    private String phoneNumber;
	public Member(int id, String name, String email, String phoneNumber) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
    
    
}
