class Car
{
	static void colour()
	{	
		System.out.println("Car is Red in colour");
	}
}
class Bike extends Car
{
	static void colour()
	{	
		System.out.println("Bike is Black in colour");
	}
}
public class Vehicle
{
	public static void main(String args[])
	{
		Car car=new Car();
		Car bike=new Bike();
		car.colour();
		bike.colour();
	}
}
		