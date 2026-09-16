class A
{
	void m1()
	{
		System.out.println("HI");
	}
	void m2()
	{
		System.out.println("Hello");
	}
}
class B extends A
{
	void m1()
	{
		System.out.println("RAM");
	}
}
class Test15
{
	public static void main(String[] args)
	{
		A a = new B();
		a.m2();
		//b.m2();
	}
}