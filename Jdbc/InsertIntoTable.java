package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class InsertIntoTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Driver driver = new Driver();
		
		DriverManager.registerDriver(driver);
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		
		Statement stmt = cn.createStatement();
		
		String query = "insert into employee values(12346,'Oviya','female','test engr')";
		
		int res = stmt.executeUpdate(query);
		
		if(res==1)
		{
			System.out.println("data has been inserted successfully");
		}
		
		
		
		
		
		
	}

}
