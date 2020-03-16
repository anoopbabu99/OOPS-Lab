import java.util.*;
/*
Create a class called Book which contains data members Book
title,(Instance of author class) Author, Price of book. Create another class
Author which contains data members name, email id, phone number,
gender.Write a function for adding book details.

*/
public class q7{
	static ArrayList<Book> book = new ArrayList<Book>();
	
	public class Book{
		String bookTitle;
		Author author;
		int price;
		void addBookDetails(String bookTitle,int price, String name, String emailID, int phoneNumber,char gender)
		{
			this.bookTitle = bookTitle;
			Author a1 = new Author(name,emailID,phoneNumber,gender);
			this.author = a1;
			this.price =20;
		}
	}
	public class Author{
		String name;
		String emailID;
		int phoneNumber;
		char gender;
		Author(String name, String emailID, int phoneNumber,char gender)
		{
			this.name = name;
			this.emailID = emailID;
			this.phoneNumber = phoneNumber;
			this.gender = gender;
		}
	}
	
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		System.out.println();
		q7 obj = new q7();
		Book book1 = obj.new Book();
		book1.addBookDetails("Harry Potter", 20, "JK Rowling", "jk@gmail.com", 90401, 'F');
		book.add(book1);
		
		
	}
}