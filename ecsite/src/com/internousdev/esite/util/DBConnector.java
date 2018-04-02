package com.internousdev.esite.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector {
	private static String driverName ="com.mysql.jdbc.Driver";
	private static String url ="jdbc:mysql://localhost/ecsite";

	private static String user ="root";
	private static String password = "mysql";

		public Connection getConnection(){
			Connection con = null;

			try{

				Class.forName(driverName);
				con = (Connection) DriverManager.getConnection(url,user,password);
			}catch(ClassNotFoundException e){
					e.printStackTrace();
			}catch(java.sql.SQLException e){
					e.printStackTrace();
			}
			return con;
		}
}
