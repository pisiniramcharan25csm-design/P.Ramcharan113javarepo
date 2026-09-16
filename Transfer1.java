class Transfer1
{
	public static void main(String args[])
	{
		l1:for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{	
				if(j==5)
				{
					break l1;
				}
				System.out.println(i+ "------" +j);
			}
		}
	}
}