import java.sql.*;

public class Database_Connector {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/first_test", "user1", "Shashu123");
			//System.out.println("Connection Successful!");
			String query = "SELECT * FROM school";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
				System.out.println("Student name: " + rs.getString("student_name"));
			}
		}
		catch (Exception e){
			System.out.println("Connection Failed :(");
			e.printStackTrace();
		}
	}
}