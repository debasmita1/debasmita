//Method Overriding
class Fruit
{
	public void colour()
	{
		System.out.println("I love fruits!!");
	}
}
class Banana extends Fruit
{	
	public void colour()
	{
		System.out.println("Yellow");
	}
}
class Apple extends Fruit
{	
	public void colour()
	{
		System.out.println("Red");
	}
}
class Guava extends Fruit
{	
	public void colour()
	{
		System.out.println("Green");
	}
}
class Taste
{
	public static void main(String args[])
	{
		Fruit b=new Banana();	
		Fruit a=new Apple();
		Fruit g=new Guava();
		b.colour();
		a.colour();
		g.colour();
	}
}