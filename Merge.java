
import java.util.*;
import java.lang.*;
import java.io.*;
 
class Merge
{
    public static void Arr(int[] arr1, int[] arr2,int[] arr3, int n1,int n2 )
    {
        int i = 0, j = 0, k = 0;
        while (i<n1 && j <n2)
        {
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }
        while (j < n2)
            arr3[k++] = arr2[j++];
        while (i < n1)
            arr3[k++] = arr1[i++];
    }
     
    public static void main (String args[]) 
    {
        int[] arr1 = {1, 3, 5, 7,9,11};
        int n1 = arr1.length;
        int[] arr2 = {2, 4, 6, 8,10,12};
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
         Arr(arr1, arr2, arr3,n1, n2);
        System.out.println("After merging:");
        for (int i=0; i < n1+n2; i++)
       	 System.out.print(arr3[i] + " ");
    }
}
 