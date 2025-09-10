package collectionsdemo.listdemo;

import java.util.ArrayList;

/**
 * Author :Jetty.Srikar
 * Date :Sep 9, 2025
 * Time :11:39:09 AM
 *project : projCoreJava
 */

public class UserDefinedObjects {

	public static void main(String[] args) {
		//Program to store user defined Objects in collections



		//Creating Books  object & initialized using Book Constructor
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		
		//creating list
		ArrayList<Book> bList = new ArrayList<>();
		
		//add books
		bList.add(b1);
		bList.add(b2);
		bList.add(b3);
		
		//Traverse a List
		System.out.println("**************** Book List ******************");
		for(Book i : bList) {
			System.out.println(i.getId()+" "+i.getName()+" "+i.getAuthor()+" "+i.getPublisher()+" "+i.getQuantity());
		}
		System.out.println("Total no of books : "+bList.size());

	}

}
