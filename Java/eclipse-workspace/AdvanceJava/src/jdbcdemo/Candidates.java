package jdbcdemo;
import java.sql.*;
import java.util.Scanner;
/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :11:23:16 AM
 *project : projAdvanceJava
 */

public class Candidates {

	// Instance class to Update data in candidates table using PreparedStatement


	Connection con;
		PreparedStatement pstmt; // Accepts values at run time - pre compiled statements
		ResultSet rs;
		
		int cnt=0;
		String sqlUpdate;
		Scanner s;
		int eid;
		String newLastname;
		
		public void getConnection() throws Exception
		{
			con=ConnectionUtil.createConnection();
		}
		
		public void UpdateCandidate() throws Exception
		{
			sqlUpdate="UPDATE candidates SET last_name = ? WHERE id = ?";
			
			pstmt=con.prepareStatement(sqlUpdate);
			
			// prepare data for update
			s=new Scanner(System.in);
			System.out.println("enter Employee id:");
			eid=s.nextInt();
			System.out.println("enter employee's new last name :");
			newLastname=s.next();
					
			 // passing values to prepared statement using setter methods
			pstmt.setString(1, newLastname);
			pstmt.setInt(2, eid);
			
			cnt=pstmt.executeUpdate();
			System.out.println(String.format("Row affected : %d", cnt));
			
			// reuse the prepared statement
	        newLastname = "Clinton";
	        eid = 101;
	        pstmt.setString(1, newLastname);
	        pstmt.setInt(2, eid);

	        cnt = pstmt.executeUpdate();
	        System.out.println(String.format("Row affected %d", cnt));
	        con.close();
		}
}
