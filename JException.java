//Exception handling
class JException
{
	public static void main(String args[])
	{
	try{
		int i=0;
		int j=20;
		int div=i/j;
	}
	catch(ArithmeticException e)
	{
		System.out.println("In the catch block due to Exception="+e);
	}
	finally{
		System.out.println("Inside the finally block");
	}
}
}