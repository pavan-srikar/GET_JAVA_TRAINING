package controlflow;

/**
 * Author :Jetty.Srikar
 * Date :Sep 1, 2025
 * Time :4:16:26 PM
 *project : projCoreJava
 * 👍 A cinema hall seating arrangement is a great real-world example of a nested for loop.
 * ✅ This mimics a real cinema hall seating chart where each seat is identified by its row and seat number.
 * Outer loop (i) → Represents rows.
 * Inner loop (j) → Represents seats in each row.
 * Each seat is displayed in format [Row-Seat].
 */

public class NestedLoopDemo2 {

	public static void main(String[] args) {
		int weeks=3, days=7, i=1;

		while(i<=weeks) {
			System.out.println("Week : "+i);
			for(int j=1;j<=days;j++) {
				System.out.println("\t"+"Day : "+j);
			}
			i=i+1;
		}

	}

}
