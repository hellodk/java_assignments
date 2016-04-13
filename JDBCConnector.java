import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnector {
	// JDBC driver name
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	// Database URL
	static final String DATABASE_URL = "jdbc:mysql://localhost/";
	// Database user credentials
	static final String USER_NAME = "username";
	static final String PASSWORD = "password";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;

		try {
			// Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			// Open a connection
			System.out.println("Connecting to Database");
			conn = DriverManager.getConnection(DATABASE_URL, USER_NAME,
					PASSWORD);
			// Execute a query
			System.out.println("Creating Database");
			stmt = conn.createStatement();
			System.out.println("Database Connection Created Successfully");

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
				se2.printStackTrace();
			}
			try {
				if (conn != null)
					//Close Connection
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	}
}