import java.util.*;
/*
Imagine a publishing company that makes both book and audiocassette
version of its works. Create a class publication that stores the title(a string )
and price(type float) of a publication. From this class derive two classes;
book, which adds a page count(type int) and tape, which adds a playing
time in minute (type float). Each of these three classes should have
getData() function to get its data from the user at the keyboard, and a
putData() function to display its data.
Write main() program to test the book and tape classes by creating
instances of them asking the user to fill in data with getData(), and then
displaying the data with puData().
Book b = obj.new Book();
		b.getData();
		b.putData();
*/
public class q14{
	
	
	class Publication{
		Scanner cin = new Scanner(System.in);
		String title;
		float price;
		void getData()
		{
			System.out.print("Enter Title:");
			this.title = cin.nextLine();
			System.out.print("Enter Price:");
			this.price = cin.nextFloat();
		}
		void putData()
		{
			System.out.println("Title: "+title);
			System.out.println("Price: "+price);
		}
	}
	class Book extends Publication{
		int pageCount;
		void getData()
		{
			super.getData();
			System.out.print("Enter Page Count:");
			this.pageCount = cin.nextInt();
		}
		void putData()
		{
			super.putData();
			System.out.println("Page Count: "+pageCount);
		}
	}
	class Tape extends Publication{
		float playingTime;
		void getData()
		{
			super.getData();
			System.out.print("Enter Playing Time:");
			this.playingTime = cin.nextFloat();
		}
		void putData()
		{
			super.putData();
			System.out.println("Playing Time: "+playingTime);
		}
	}
	public static void main(String args[])
	{
		q14 obj = new q14();
		
		Tape t = obj.new Tape();
		t.getData();
		t.putData();
		
		Book b = obj.new Book();
		b.getData();
		b.putData();
	}
}