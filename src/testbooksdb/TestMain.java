package testbooksdb;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

import booksdb.Book;

public class TestMain {
	public static void main(String[] args) throws SQLException {
		
		Scanner in=new Scanner(System.in);
		int id=in.nextInt();
		String name;
		Book book1=new Book();
		name=book1.getName(id);
		System.out.println(name);
		
		
		
	}

}
