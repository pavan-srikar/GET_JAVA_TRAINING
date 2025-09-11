package jdbcdemo;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :11:22:41 AM
 *project : projAdvanceJava
 */

public class UpdateDemo {

	public static void main(String[] args) {
		Candidates c1=new Candidates();
		
		System.out.println("************ UPDATE CANDIDATE DETAILS ***************");
		
		try {
			c1.getConnection();
			c1.UpdateCandidate();
		}
		catch(Exception e){
			System.out.println(e);
		}

	}

}
