
package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchFromDatabase {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//jdbc:mysql://localhost:3306/mydb
		
		Driver driver = new Driver();
		
		DriverManager.registerDriver(driver);
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		
		Statement stmt = cn.createStatement();
		
		String query = "select * from employee";

		ResultSet res = stmt.executeQuery(query);
		
		while(res.next())
		{
			System.out.println(res.getInt(1)+" " + res.getString(2)+" " + res.getString(3)+" " + res.getString(4));
		}
		

	}

}
