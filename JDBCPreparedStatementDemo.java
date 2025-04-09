import java.util.*;
import java.sql.*;
public class JDBCPreparedStatementDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Employee Number");
		int eno = s.nextInt();
		System.out.println("Enter Employee Name");
		String ename = s.next();
		System.out.println("Enter Employee Salary");
		float salary = s.nextFloat();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java02","root","root");
			/*PreparedStatement st = con.prepareStatement("insert into employee values(?,?,?)");
			st.setInt(1, eno);
			st.setString(2, ename);
			st.setFloat(3,salary);
			st.executeUpdate();
			System.out.println("Inserted");*/
			PreparedStatement st = con.prepareStatement("insert into employee values("+eno+",'"+ename+"',"+salary+")");
			st.executeUpdate();
			System.out.println("Inserted");
			st.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
