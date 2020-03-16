import java.util.*;
/*
Create a class ‘Address’ with data members: streetnum, city, state, country
and constructor Address(streetnum,city,state,country). Create a ‘Student’
class with data members: rollno, stu_name, address of type ‘Address’.
Print the rollno, stu_name and address of a student.
*/
class Address{
	short streetnum;
	String city, state, country;
	Address(){}
	Address(short streetnum, String city, String state, String country)
	{
		this.streetnum = streetnum; 
		this.city = city; 
		this.state = state; 
		this.country =  country;
	}
}
class Student extends Address{
	Scanner cin = new Scanner(System.in);
	String rollNumber, stu_name;
	Student()
	{
		streetnum = cin.nextShort();
		city = cin.next();
		state = cin.next();
		country = cin.next();
	}
	void printDetails()
	{
		
	}
	
}
public class q4{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		System.out.println();
		
	}
}