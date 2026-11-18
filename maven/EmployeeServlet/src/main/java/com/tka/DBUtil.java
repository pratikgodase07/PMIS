package com.tka;

public class DBUtil {
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.driver");
			
			con.DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		}
	}
}
