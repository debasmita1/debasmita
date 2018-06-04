//Constructor Overloading
class Student
{
	private String name;
	private int id;
	Student()
	{
		id=1;
		name="Rani";
	}
	Student(int num,String str)
	{
		name=str;	
		id=num;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public static void main(String args[])
	{
		Student s=new Student();
		System.out.println("Id is : " +s.getId());
		System.out.println("Name is : " +s.getName());
		Student st=new Student(2,"Ram");
		System.out.println("Id is : " +st.getId());
		System.out.println("Name is : " +st.getName());
	}
}
	