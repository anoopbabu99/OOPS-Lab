import java.util.*;
class School{
	String sch_name;
	short est_year;
	School()
	{
		sch_name = "DEFAULT";
		est_year =2000;
	}
	School(String sch_name)
	{
		this.sch_name = sch_name;
		est_year =0;
	}
	School(String sch_name,short est_year)
	{
		this.sch_name = sch_name;
		this.est_year = est_year;
	}
	
}

public class q3{
	public static void main(String args[])
	{
		Scanner cin = new Scanner(System.in);
		School defaultSchool = new School();
		School school1 = new School("school1");
		School school2 = new School("school2",(short) 1954);
		System.out.println(defaultSchool.sch_name+" "+defaultSchool.est_year);
		System.out.println(school1.sch_name+" "+school1.est_year);
		System.out.println(school2.sch_name+" "+school2.est_year);
		
		
	}
}