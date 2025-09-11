package jdbcdemo;
import java.sql.*;

/**
 * Author :Jetty.Srikar
 * Date :Sep 11, 2025
 * Time :10:18:49 AM
 *project : projAdvanceJava
 */

public class InsertDemo2 {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		int count;
		try {
			// Step 1: Establish a connection
			con = ConnectionUtil.createConnection();
			
			String str="INSERT INTO skills(name) VALUES('Rust')";
			
			stmt=con.createStatement();
			
			count=stmt.executeUpdate(str); //return no of records affected
				
			if(count>0) {
				System.out.println("Record Inserted Successfully");
			}
			
			//count total no. of records in table
			String str1= "SELECT COUNT(id) FROM SKILLS";
			rs=stmt.executeQuery(str1);
			int cnt = 0;
			while(rs.next()) {
				cnt=rs.getInt(1);
			}
			System.out.println("total records : "+cnt);
		}catch( Exception e) {
			System.out.println(e);
		}

	}

}
