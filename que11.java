class que11
{
	public static void main(String args[])
	{
		int a=args.length;
		try
		{
			if(a==0 || a==1)
				throw new ArithmeticException("1 or 0");
			if(a==2)
				throw new ArrayIndexOutOfBoundsException("2");
		}
		catch(Exception e)
		{
			System.out.println("Caught "+e);
		}
	}
}