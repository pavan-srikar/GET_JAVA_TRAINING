package collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Author :Jetty.Srikar
 * Date :Sep 9, 2025
 * Time :10:20:54 AM
 *project : projCoreJava
 */

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// Create a generic ArrayList of Type String
		ArrayList<String> p1=new ArrayList<>();
		
		//Add elements to ArrayList - It maintains order of Insertion. Data stored inform of Objects
		p1.add("JAVA");
		p1.add("c");
		p1.add("C++");
		p1.add("Ruby");
		p1.add("Rust");
		p1.add("C#");
		p1.add("python");
		
		//Display ArrayList contents as List
		System.out.println("Programming Languages ArrayList :"+p1);
		
		//Access elements using get() method
		System.out.println("Element at Index 1 is :"+p1.contains("JAVA"));
		//ADD elements at specific index
        p1.add(2,"oracle");
        System.out.println("Programming lANGUAGES ArrayList:"+p1);
        //Manipulations
        System.out.println("Is ArrayList Empty?:"+p1.isEmpty());
        System.out.println("The position of Python:"+p1.indexOf("Python"));
        System.out.println("The size of ArrayList:"+p1.size());
        
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(89);//Autoboxing convert primitive types to object
        marks.add(45);
        marks.add(68);
        marks.add(94);
        marks.add(75);
        
        
        //marks.add("Hello"); //Compiler Error - Type Safety

        System.out.println("The Marks ArrayList is :"+marks);
        System.out.println("The Size of Marks ArrayList is : "+marks.size());
        System.out.println("The Marks at 3rd index is : "+marks.get(3)); // AutoUnboxing - Convert Object to primitive type

        Collections.sort(marks);
        System.out.println("Marks ArrayList after Sorting :"+marks);

	}

}
