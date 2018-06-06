//Binary Search
import java.util.Scanner;
 
class BinarySearch 
{
 	 public static void main(String args[])
  	{
  		  int i, first, last, middle, n, num, array[];
  		  Scanner in = new Scanner(System.in);
    		  System.out.println("Enter number of elements to be entered:");
   		 n = in.nextInt(); 
   		 array = new int[n];
   		 System.out.println("Enter the integers in ascending order ");
   		 for (i = 0; i < n; i++)
     		 array[i] = in.nextInt();
    		System.out.println("Enter number to find");
    		num = in.nextInt();
  		  first  = 0;
   		 last   = n - 1;
    		middle = (first + last)/2;
   		 while( first <= last )
  		  {
     			 if ( array[middle] < num )
        			first = middle + 1;    
     			 else if ( array[middle] == num ) 
     			 {
        				System.out.println(num + " found at location " + (middle + 1) + ".");
        				break;
    			  }
    			  else
         			last = middle - 1;
 			middle = (first + last)/2;
 		  }
  		 if ( first > last )
      		System.out.println(num + " isn't present in the list.\n");
 	 }
}