class Person
{
    int a=3,b=4;
	void disp()
	{
		System.out.println("a = "+a+" b = "+b+" in person class");
	}
}

class Student extends Person
{
	int a=5,b=7;
	void disp()
	{
		System.out.println("a = "+a+" b = "+b+" in Student class");
	}
	void display()
	{
		super.disp();
		disp();
	}
}
class q4
{
	public static void main(String args[])
	{
		Student s = new Student();
		s.display();
	}
}