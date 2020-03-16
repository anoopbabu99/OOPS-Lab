import java.util.*;
/*
Write a function that would display the contact details of the author
when the book title is given as input.
*/
public class q10{
	static ArrayList<Book> bookList = new ArrayList<Book>();
	
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
		void deleteBook(String bookTitle)
		{
			for(int i=0; i<bookList.size();i++)
			{
				if(bookList.get(i).bookTitle == bookTitle)
				{
					bookList.remove(i);
					break;
				}
			}
		}
		void displayFemaleAuthors()
		{
			for(int i=0; i<bookList.size();i++)
			{
				if(bookList.get(i).author.gender == 'F')
				{
					System.out.println(bookList.get(i).author.name);
				}
			}
		}
		void displayContactDetail(String bookTitle)
		{
			int index=0;
			for(int i=0; i<bookList.size();i++)
			{
				if(bookList.get(i).bookTitle == bookTitle)
				{
					index = i;
					break;
				}
			}
			System.out.println(bookList.get(index).author.name);
			System.out.println(bookList.get(index).author.emailID);
			System.out.println(bookList.get(index).author.phoneNumber);
			System.out.println(bookList.get(index).author.gender);
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
		q10 obj = new q10();
		Book book1 = obj.new Book();
		book1.addBookDetails("Harry Potter", 20, "JK Rowling", "jk@gmail.com", 90401, 'F');
		bookList.add(book1);
		
	}
}