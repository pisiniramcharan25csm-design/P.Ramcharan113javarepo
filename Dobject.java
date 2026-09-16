import java.util.*;
class Student
{
	int rollno;
	String name;
	double marks;
	void display()
	{
		System.out.println("Student details:");
		System.out.println("Roll.no: " +rollno+ "\nName: " +name+ "\nMarks: "+ marks);
	}
}
class Dobject
{
	public static void main(String[] args)
	{
		Student s1 = new Student();
		System.out.print("Enter Roll.no:");
		Scanner sc = new Scanner(System.in);
		s1.rollno = sc.nextInt();
		
		System.out.print("Enter Name:");
		Scanner sn = new Scanner(System.in);
		s1.name = sn.nextLine();
		
		System.out.print("Enter marks:");
		Scanner sl = new Scanner(System.in);
		s1.marks = sl.nextDouble();
		s1.display();
	}
}