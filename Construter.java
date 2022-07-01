class Employee
{
	int age;
	String name;
	
	//Default Constructor
	Employee()
	{
		age =100;
		name="Test1";
	}
	
	//Parameterized Constructor
	Employee(int age,String name)
	{
		this.age =age;
		this.name=name;
	}
	
	public void disp()
	{
		System.out.println("Name : "+name+" Age : "+age);
	}
	
}
public class Construter 
{
	public static void main(String args[])
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee(10,"Test2");
		
		e1.disp();
		e2.disp();
	}
}