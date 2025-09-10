package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Author :Jetty.Srikar
 * Date :Sep 10, 2025
 * Time :3:36:51 PM
 *project : projAdvanceJava
 */

public class SelectDemo3 {

	public static void main(String[] args) {
		Connection con=null;
		Statement stmt;
		ResultSet rs;

		try {
			// Load the MySQL JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","pavan123");

			// Create a statement object to execute the query
			stmt=con.createStatement();

			// Execute the query and get the result set
			rs=stmt.executeQuery("SELECT id,first_name,dob,phone,email "
					+ "from candidates");

			// Process the result set
			while(rs.next())
			{
				// Retrieve data by column name or index
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString("dob")+"\t"+
						rs.getString("email")+"\t"+rs.getString("phone"));
			}
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}

	}

}
