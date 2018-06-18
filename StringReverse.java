import java.util.Scanner;
public class StringReverse
{
	public static void main(String args[])
	{
		String s;
		System.out.println("Enter a sentence:");
		Scanner scanner=new Scanner(System.in);
		s=scanner.nextLine();
		scanner.close();
		String str=reverseString(s);
		System.out.println(str);
	}
	public static String reverseString(String s)
	{
		if(s.isEmpty())
		return s;
		return reverseString(s.substring(1))+s.charAt(0);
	}
}