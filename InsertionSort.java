 
public class InsertionSort 
{
    	public static void main(String args[])
 	{    
       		 int[] arr = { 2, 8, 4, 6, 13, 22, 50};
        		insertionSort(arr);
   	 }
     
   	 private static void show(int[] arr)
	 {
         		 for (int i = 0; i < arr.length; i++) {
            		System.out.print(arr[i] + ", ");
        	}
        	System.out.println("\n");
  }
 
 public static void insertionSort(int array[])
 {
        int n = array.length;
        for (int j = 1; j < n; j++)
        {
           	 int pivot = array[j];
            	int i = j-1;
                   while ( (i > -1) && ( array [i] >pivot) ) {
                	array [i+1] = array [i];
                   i--;
            }
            array[i+1] = pivot;
            show(array);
        }
    }
}