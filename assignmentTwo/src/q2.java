import java.util.*;

class Worker{
		int age, phoneNumber, jobLevel, salary;
		String address, name;
		Worker() {}
		void printSalary()
		{
			System.out.print(salary);
		}
		void showDetails()
		{
			System.out.println(name);
			System.out.println(age);
			System.out.println(address);
			System.out.println(phoneNumber);
			System.out.println(jobLevel);
			System.out.println(salary);
		}
	}
class Employee extends Worker{
	String specialization, department;
	Employee()
	{
		salary = 20000+jobLevel*25000;
	}
	
}
class Manager extends Worker{
	String specialization, department;
	Manager()
	{
		salary = 30000+jobLevel*25000;
	}
}
public class q2{
		
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		System.out.println();
		
	}
}