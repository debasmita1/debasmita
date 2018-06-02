//Method Overloading
class Rectangle
{
	public static void findarea(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void findarea(int a)
	{	
		System.out.println(a*a);
	}
	public static void findarea(int a,double b)
	{
		System.out.println(a*b);
	}
	public static void findarea(double b)
	{
		System.out.println(b*b);
	}
	public static void main(String args[])
	{	
		findarea(20,30);
		findarea(70,80);
		findarea(50);
		findarea(90);
	}
}
