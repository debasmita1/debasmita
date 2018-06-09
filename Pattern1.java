//Pattern of stars
import java.io.*;
public class Pattern1
{
    public static void pattern(int n)
    {
        int i, j;
        for(i=0; i<n; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
   }
    public static void main(String args[])
    {
        int n = 10;
        pattern(n);
    }
}