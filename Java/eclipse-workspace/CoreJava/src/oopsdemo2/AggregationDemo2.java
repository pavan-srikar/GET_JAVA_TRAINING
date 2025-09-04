package oopsdemo2;

/**
 * Author :Jetty.Srikar
 * Date :Sep 4, 2025
 * Time :12:13:18 PM
 *project : projCoreJava
 */

public class AggregationDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Author author = new Author("John", 42, "USA");

		Publisher publisher = new Publisher("Sun Publications","JDSR-III4", "LA");

		Book b = new Book("Java for Begginers", 800, author, publisher);

		b.display();

	}

}
