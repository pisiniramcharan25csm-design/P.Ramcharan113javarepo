class A
{
	int m(int k,int l)
	{
		return k+l;
	}
	double m(double m,double n)
	{
		return m+n;
	}
}
class Test17
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m(10,20);
		a.m(10.5,10.6);
	}
}