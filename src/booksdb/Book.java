package booksdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Book {
	private String name;
	private float price;
	private int id;
	private Connection connection;

	public Book() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			connection = DriverManager.getConnection(url, "hr", "hr");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getName(int id) throws SQLException {
		PreparedStatement stmt;
		stmt = connection.prepareStatement("select name from books where id="+ id);
		ResultSet rs =stmt.executeQuery();
		if (rs.next()) 
		{
			name = rs.getString("name");
		}
		else
		{
		    return "NOT FOUND";
		}

		return name;
	}

	

}
