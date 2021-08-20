import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

class Connect
{
	public static void main(String args[])throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = null;
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","Pass@1234");
		Statement st = con.createStatement();
		//ResultSet rs = st.executeQuery("select * from mysql");
		//System.out.println(con.getClass());
		if(con == null)
		{
			System.out.println("Connection Not Established");
		}
		else
		{
			System.out.println("Connetion Established");
		}
	}
}