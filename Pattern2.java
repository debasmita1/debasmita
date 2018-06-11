//Pyramid pattern
import java.io.*;

public class Pattern2
{
    public static void pattern(int n)
    {
        int k = 2*n - 2;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<k; j++)
            {
                System.out.print(" ");
            }
            k = k - 1;
            for (int j=0; j<=i; j++ )
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