//Polymorphism Example
class Student
{
	double subjectMarks()
	{
		return 0;
	}
}
class Ravi extends Student
{
	double subjectMarks()
	{
		return 70;
	}
}
class Rani extends Student
{
	double subjectMarks()
	{
		return 80;
	}
}
class Sita extends Student
{
	double subjectMarks()
	{
		return 85;
	}
}
class Ram extends Student
{
	double subjectMarks()
	{
		return 90;
	}
}
class Exam
{
	public static void main(String args[])
	{	
		Student s;
		s=new Ravi();
		System.out.println("Ravi scored:"+s.subjectMarks());
		s=new Rani();
		System.out.println("Rani scored:"+s.subjectMarks());
		s=new Sita();
		System.out.println("Sita scored:"+s.subjectMarks());
		s=new Ram();
		System.out.println("Ram scored:"+s.subjectMarks());
	}
}