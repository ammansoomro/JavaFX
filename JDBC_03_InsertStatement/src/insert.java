import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insert {

	public static void main(String[] args) throws Exception {
		// see note at bottom
		Scanner scan = null;
		int sno = 0;
		String sname = null, sadd = null;
		String query = null;
		Statement st = null;
		int count = 0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		// variables for connection
		final String url = "jdbc:mysql://localhost:3306/mylab";
		final String user = "root";
		final String password = "DarkRealm007";
		Connection con = DriverManager.getConnection(url, user, password);
		Scanner scanner = scan = new Scanner(System.in);
		if (scan != null) {
			System.out.print("Enter student number: ");
			sno = scan.nextInt();
			System.out.print("Enter student name: ");
			sname = scan.next();
			System.out.print("Enter student address: ");
			sadd = scan.next();
			query = "INSERT INTO PERSON VALUES (" + sno + ", " + "\'" + sname + "\' ," + "\'" + sadd + "\') ";

			if (con != null) {
				st = con.createStatement();
			}
			if (st != null) {
				count = st.executeUpdate(query);
			}
			System.out.println(count + " record inserted.");
		}
	}

}