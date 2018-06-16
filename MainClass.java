import java.util.*;
import java.lang.*;
import java.io.*;
 
class Employee
{
    	int id;
   	 String name;
 
   	 public Employee(int id, String name)
   	 {
        		this.id = id;
        		this.name = name;
   	 }
 
   	 public String toString()
    	{
        		return this.id + " " + this.name;
    	}
}
 
class ArrangeId implements Comparator<Employee>
{
   	 public int compare(Employee a1, Employee a2)
   	 {
        		return a1.id - a2.id;
   	 }
}
 
class ArrangeName implements Comparator<Employee>
{
    	public int compare(Employee a1, Employee a2)
    	{
       		 return a1.name.compareTo(a2.name);
    	}
}
 
public class MainClass
{
   	 public static void main (String args[])
   	 {
      		  ArrayList<Employee> e = new ArrayList<Employee>();
       		 e.add(new Employee(1, "Ram"));
       		 e.add(new Employee(2, "Rohan"));
        		e.add(new Employee(3, "Gita"));
        		e.add(new Employee(4, "Mita"));
 
        		System.out.println("Unsorted");
       		 for (int i=0; i<e.size(); i++)
           		 System.out.println(e.get(i));
 
       		 Collections.sort(e, new ArrangeId());
 
       		 System.out.println("\nArranged according to Id");
       		 for (int i=0; i<e.size(); i++)
           		 System.out.println(e.get(i));
 
       		 Collections.sort(e, new ArrangeName());
 
        		System.out.println("\nArranged according to Name");
        		for (int i=0; i<e.size(); i++)
            		System.out.println(e.get(i));
   	 }
}