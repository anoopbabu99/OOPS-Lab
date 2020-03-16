import java.util.*;
/*
For the above class Write another function to delete book entry according
to book title.
*/
public class q8{
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
				}
			}
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
		q8 obj = new q8();
		Book book1 = obj.new Book();
		book1.addBookDetails("Harry Potter", 20, "JK Rowling", "jk@gmail.com", 90401, 'F');
		bookList.add(book1);
		
		
		
	}
}