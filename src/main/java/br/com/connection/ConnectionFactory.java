package br.com.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class ConnectionFactory {
	public java.sql.Connection getConnection() {
	
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		return DriverManager.getConnection("jdbc:mysql://localhost/javaee-arlindo", "root", "");
		} catch(SQLException e){
			throw new RuntimeException(e);
			
		}
		
		/*
		try {
			return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/javaee-arlindo", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		*/
	}
	/*
	 * public static Connection getConnection() throws SQLException{ try {
	 * Class.forName("org.h2.Driver"); //driver para h2 db return (Connection)
	 * DriverManager.getConnection("jdbc:h2:tcp://localhost:9001/db/meudb","sa",
	 * "123"); //retorna conexao h2 db }catch (ClassNotFoundException e) {
	 * JOptionPane.showMessageDialog(null, e.getMessage()); throw new
	 * SQLException(); }
	 */

}
