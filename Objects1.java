class Student
{
	int rollno;
	String name;
	double marks;
	
	void display()
	{	
		System.out.println("Roll.no: " +rollno+ "\nName: " +name+ "\nMarks: " +marks);
	}
}
class Objects1
{
	public static void main(String[] args)
	{	
		Student s1 = new Student();
		s1.rollno=113;
		s1.name="RAM CHARAN";
		s1.marks=8.85;
		s1.display();
	}
}