class A
{
	int i;
	int j;
	static int m=90;
	A(int k,int l)
	{
		this.i=k;
		this.j=l;
	}
}
class constructors
{
	public static void main(String[] args)
	{
		A a = new A(10,20);
		A a1 = new A(30,40);
		A a2  = new A(50,60);
		System.out.println(a1.i);
		System.out.println(a1.j);
		
		System.out.println(a.i);
		System.out.println(a.j);
		
		System.out.println(a2.i);
		System.out.println(a2.j);
		//static
		System.out.println(a.m);
		System.out.println(a1.m);
		System.out.println(a2.m);
		a1.i=a1.i+10;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a.i);
		a2.m=a2.m+50;
		System.out.println(a.m);
		System.out.println(a1.m);
		System.out.println(a2.m);
	}
}