import java.sql.*;
public class JDBCStatementDemo {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java02","root","root");
			//System.out.println("connected");
			Statement st = con.createStatement();
			/*st.execute("create table employee (eno int(3), ename varchar(10), salary float(4))");
			System.out.println("table created");*/
			/*st.executeUpdate("insert into employee values (111,'Tej', 150000)");
			st.executeUpdate("insert into employee values (222,'Ram', 160000)");
			st.executeUpdate("insert into employee values (333,'raj', 170000)");
			st.executeUpdate("insert into employee values (444,'yash', 160000)");
			System.out.println("Inserted");*/
			/*int n = st.executeUpdate("Update employee set salary= 9000");
			System.out.println("Records updated");*/
			/*int n = st.executeUpdate("delete from employee");
			System.out.println("Records deleted");*/
			ResultSet rs = st.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt("eno")+" "+rs.getString("ename")+" "
						+rs.getFloat(3));
			}
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
