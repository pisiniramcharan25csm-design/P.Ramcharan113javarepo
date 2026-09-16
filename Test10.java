class Test10
{
	public static void main(String[] args)
	{
		long l = 200L;
		short s = (short)(int)(float)(byte)(double)l; //right to left conversion
		System.out.println(s);
		
		
		//double to byte conversion
		double d=200.0;
		byte b = (byte)d;
		System.out.println(b);
	}
}