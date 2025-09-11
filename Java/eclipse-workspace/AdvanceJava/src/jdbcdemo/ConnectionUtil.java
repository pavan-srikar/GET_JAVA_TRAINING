package jdbcdemo;
import java.sql.*;

/**
Utility class to create connection
 */

public class ConnectionUtil {
	public static Connection createConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqljdbc","root","pavan123");
		return con;
	}
}
