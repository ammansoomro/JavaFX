import java.sql.Connection;
import java.sql.DriverManager;

public class conn {

	public static void main(String[] args) throws Exception {
		// see note at bottom
		Class.forName("com.mysql.cj.jdbc.Driver");
		// variables for connection
		final String url = "jdbc:mysql://localhost:3306/mylab";
		final String user = "root";
		final String password = "DarkRealm007";

		// establish the connection
		Connection con = DriverManager.getConnection(url, user, password);

		// display status message
		if (con == null) {
			System.out.println("JDBC connection is not established");
			return;

		} else {
			System.out.println("Congratulations, JDBC connection is established successfully.\n");

		}

		// Remember to close the JDBC connection
		con.close();
	}
}
