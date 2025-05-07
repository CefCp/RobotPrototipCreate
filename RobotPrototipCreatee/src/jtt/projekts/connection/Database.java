package jtt.projekts.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Database {
	private static String url = "jdbc:mysql://localhost:3306/robotprototipuprojekts";
	private static String user = "root";
	private static String password = "";
	private static String charset = "utf-8";
	
	 public Database() {}
	 
	 
	 public static Connection getConnection() throws SQLException {
		 Connection conn;
		 
		 Properties properties = new Properties();
		 properties.put("user", user);
		 properties.put("password", password);
		 properties.put("charset", charset);
		 
		 conn = DriverManager.getConnection(url, properties);
		 return conn;
		 
	 }
	 
	 
	 public static void closeConnection(Connection connection) throws SQLException{	 connection.close(); }
	 
	 public static void closeStatment(Statement statment)throws SQLException{statment.close();}
	 
	 public static void closePreperedStatmnet(PreparedStatement ps)throws SQLException{ps.close();}
	 
	 public static void closeResultSet(ResultSet resultSet)throws SQLException{resultSet.close();}
}
