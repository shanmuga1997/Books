package booksdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionUtil {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Connection connection=DriverManager.getConnection(url,"hr","hr");
			Scanner in=new Scanner(System.in);
			int id=in.nextInt();
		    PreparedStatement stmt=connection.prepareStatement("select name from books where id="+id);
		    ResultSet rs=stmt.executeQuery();
		    while(rs.next())
		    {
		    	System.out.println(rs.getString(1));
		    }
		    stmt.execute();
		   
		    
		    
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
  
}
