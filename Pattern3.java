//Number Pyramid
import java.io.*;
 
public class Pattern3
{
    public static void pattern(int n)
    {
        int i, j, num=1;
        for(i=0; i<n; i++)
        {
            for(j=0; j<=i; j++)
            {
                System.out.print(num+ " ");
                num = num + 1;
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