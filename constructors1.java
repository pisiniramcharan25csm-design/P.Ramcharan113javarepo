class Box
{
	double length,width,height;
	Box()
	{
		length=width=height=1.0;
	}
	double volume()
	{
		return length*width*height;
	}
}
class constructors1
{
	public static void main(String[] args)
		{
			new Box().volume();
			System.out.println("Volume: " + new Box().volume());
		}
		
}