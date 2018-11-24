package fr.formation.blog.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
	
	private static final MySQLConnection INSTANCE = new MySQLConnection();
	private Connection conn;
	
	public static MySQLConnection getInstance() {
		return MySQLConnection.INSTANCE;
	}
	
	public MySQLConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog?serverTimezone=Europe/Paris","root","root");
		} catch (SQLException e) {
	//		System.out.println("Aucune connexion");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public Connection getConn() {
		return conn;
	}
	
}
