package jdbcdemo;

import java.sql.*;

/**
 * Author :Jetty.Srikar
 * Date :Sep 10, 2025
 * Time :2:12:27 PM
 *project : projAdvanceJava
 */

public class SelectDemo {
	//DataBase credentials
	private static final String URL="jdbc:mysql://localhost:3306/classicmodels";
	private static final String USER="root";
	private static final String PASSWORD="pavan123";


	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			//step 1: Load MySQL Driver (optional)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
			
			//step 2: Establish Connection
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connected to DB successfully");
			
			//step3: create statement
			stmt=conn.createStatement();
			
			//step 4: Execute Query
			String sql="SELECT customerNumber, customerName, city ,creditLimit FROM customers";
			rs = stmt.executeQuery(sql);
			
			System.out.println("-------------- Customer Records ---------------");
			
			//Step 5: Process results
			while(rs.next()) {
				int id = rs.getInt("customerNumber");
				String name=rs.getString("customerName");
				String city=rs.getString(3);
				double credit=rs.getDouble(4);
				
				System.out.printf("ID: %d | name: %s | city : %s | credits : %2f%n",id,name,city,credit );
				
			}
		}
		catch (Exception e) {
			System.out.println("Database operation failed.");
			e.printStackTrace();
		}
		finally {
			// Step 6: Close resources manually
			try {
				if( rs!=null) rs.close(); if(stmt != null) stmt.close();  if(conn != null) conn.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(" Resources Closed.");
				
			}




	}

}
