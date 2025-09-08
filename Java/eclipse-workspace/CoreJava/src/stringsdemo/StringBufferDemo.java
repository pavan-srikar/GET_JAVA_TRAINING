package stringsdemo;

/**
 * Author :Jetty.Srikar
 * Date :Sep 8, 2025
 * Time :1:01:38 PM
 *project : projCoreJava
 */

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("Java"); // mutable string Object
		System.out.println("The Original String Buffer Object :"+buf);

		buf.append(" Guide Ver1/"); // append // Java Guide Ver1/7
		buf.append(7);
		System.out.println(buf);

		int index = 5;   // Insert  // Java Student Guide Ver1/7
		buf.insert(index, "Student ");
		System.out.println(buf);

		index = 23;      // Set  // Java Student Guide Ver1.7
		buf.setCharAt(index, '.');
		System.out.println(buf);

		int start = 24;   // Replace  // Java Student Guide Ver1.8
		int end = 25;
		buf.replace(start, end, "8");
		String s = buf.toString();   //Convert to string
		System.out.println(buf.reverse());
		System.out.println(s);

		buf=new StringBuffer(); // Clear the StringBuffer
		System.out.println("Cleared StringBiffer :"+buf);

	}

}
