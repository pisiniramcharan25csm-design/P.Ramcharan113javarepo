class A
{
	int i,j,k;
	A(int i)
	{
		this.i=i;
	}
	A(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	A(int i,int j,int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	void m()
	{
		System.out.println(i+j+k);
	}
}
class Test18
{
	public static void main(String args[])
	{
		A a = new A(10);
		A a1 = new A(10,20);
		A a2 = new A(50,60,70);
		a.m();
	}
}	