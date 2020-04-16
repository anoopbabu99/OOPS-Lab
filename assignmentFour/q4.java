import java.util.*;
//dynamic binding A4Q4.

//static binding occurs at compile time whereas dynamic binding occurs at runtime.
//overloading uses static binding whereas overriding uses dynamic binding.
//static binding uses type information to differ between methods whereas dynamic binding uses objects. 

class q4{
	
	String showQuestion() 
	{
		return "Write an example Java program to implement dynamic binding.\r\n" + 
				"(Hint: Write a class C1 which is extended by C2 , both C1 and C2 have method with the same\r\n" + 
				"names, but different definition , how can you execute both the functions from the main class by\r\n" + 
				"only using the reference of C1 )";
	}
	
	class C1{
		
		void commonMethod() {
			System.out.println("I am a method in Class 1");
		}
	}
	
	class C2 extends C1{
		
		@Override
		void commonMethod() {
			System.out.println("I am an overridden method in Class 2");
			
		}
	}
	
	public static void main(String args[]) {
		
		Scanner cin = new Scanner(System.in);
		q4 obj = new q4();

		//uncomment next line to view question. 
		//System.out.println(obj.showQuestion()); System.exit(0);
		
		//both objects are referenced by type C1 (as specified by the question).
		C1 objC1_One = obj.new C1(); //here object of C1 is referenced by type C1. 
		C1 objC1_Two = obj.new C2(); //here object of C2 is referenced by type C1 (type is C1 but object is C2).
		
		objC1_One.commonMethod(); //C1's method is called because: the object referenced by C1 type is a C1 object
		objC1_Two.commonMethod(); //C2's method is called because: the object referenced by C1 type is a C2 object
		
		//this was an example of dynamic binding.
		//it was created during runtime and used the object (not type) to bind.
		//note: objects declared can only be created during runtime and types declared are created during compile time.
	}
}