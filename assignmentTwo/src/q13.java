import java.util.*;
/*
Multiple inheritance (extending more than one class) is not supported
through class in java.Write a java program that can implement the idea of
multiple inheritance.(Hint: use interface)
*/
interface PI1 
{ 
    default void show() 
    { 
        System.out.println("Default PI1"); 
    } 
} 
  
interface PI2 
{
    default void show() 
    { 
        System.out.println("Default PI2"); 
    } 
} 
class q13 implements PI1, PI2 
{ 
    // Overriding default show method 
    public void show() 
    {
        PI1.super.show(); 
        PI2.super.show(); 
    } 
  
    public static void main(String args[]) 
    { 
    	q13 d = new q13();
        d.show(); 
    } 
} 