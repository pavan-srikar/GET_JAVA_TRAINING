package mapsdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author :Jetty.Srikar
 * Date :Sep 9, 2025
 * Time :4:19:33 PM
 *project : projCoreJava
 */

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111, "John", 29));
		al.add(new Student(222, "Mike", 21));
		al.add(new Student(555, "Mary", 26));
		al.add(new Student(565, "bJAF", 66));
		al.add(new Student(775, "Xavir", 16));
		al.add(new Student(885, "Allen", 29));
		
		System.out.println("*********** Students List **********");
		
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		Collections.sort(al);
		System.out.println("*********** Students Sorted List Based on Age **********");
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	}
}
