//Inheritance Example
 class Rectangle
{
	 double length;
	 double breadth;
	public void setAreaRectangle(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea()
	{
		return length*breadth;
	}
}
 class Cube extends Rectangle
{
	 double height;
	public void setVolumeCube(double length,double breadth,double height)
	{
		setAreaRectangle(length,breadth);
		this.height=height;
	}
	public double getVolume()
	{
		return getArea()*height;
	}
}
 class Shapes
{
	public static void main(String args[])
	{
		Cube cube=new Cube();
		cube.setVolumeCube(20,50.5,92.5);
		System.out.println("Volume : " + cube. getVolume());
	}
}



