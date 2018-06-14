import java.io.*;
public class College
{
	static FileInputStream teacher,student;
	public static void main(String args[])
	{
	try{
		teacher=new FileInputStream("Teacher");		
		System.out.println("Teachers teach students");
		try{
			student.close();
		}catch(IOException e)
		{
			System.out.println("Students");
		}
	}catch(FileNotFoundException fnfe)
	{
		System.out.println("Teachers not present");
	}catch(NullPointerException ne)
	{
		System.out.println("NullPointerException");
	}
      }
}