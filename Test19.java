class A
{
	int i = 10;
	int j = 20;
}
class B extends A
{
	int i =30;
	int j =40;
	void m()
	{
		System.out.println(super.i);
		System.out.println(super.j);
	}
}
class Test19
{
	public static void main(String[] args)
	{
		B b = new B();
		b.m();
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
	        int N=sc.nextInt();
	        int A1[]=new int[N];
	        for(int i=0;i<N;i++)
            {
                A1[i]=sc.nextInt();
            }
            for(int i=N-1;i>=0;i--)
            {
                if(A[i]!=0)
                {
                    System.out.println(i);
                    break;
                }
            }
            T--;
        }
	}
}
