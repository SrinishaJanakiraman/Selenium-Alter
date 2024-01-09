package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Handle_jdbc {
@Test
public void getdata() throws SQLException
{
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	Statement crn = con.createStatement();
	ResultSet result = crn.executeQuery("select * from data");

	while(result.next())
	{
		String un = result.getString(1);
		String pwd = result.getString(2);
		System.out.println(un+"  "+pwd);
	}
}
}
