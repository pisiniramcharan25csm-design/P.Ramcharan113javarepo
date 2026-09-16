class A
{
	int i = 10;
	int j=20;
	void m()
	{
		System.out.println("HI");
	}
}
class B extends A
{
	void m()
	{
		System.out.println("HELLO");
	}
}
class Test16
{
	public static void main(String args[])
	{
		B b = new B();
		b.m();
		
		A a = new A();
		System.out.println(b.i);
		System.out.println(b.j);
		a.m();
	}
}