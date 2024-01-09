package Jdbc_program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetch_data {

public static void main(String[] args) throws SQLException {
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/txt","root","root");
	Statement crn=con.createStatement();
	ResultSet result=crn.executeQuery("select* from data");
	while(result.next())
	{
		String un=result.getString(1);
		String pwd=result.getString(2);
		System.out.println(un+"    "+pwd);
	}
}
}
