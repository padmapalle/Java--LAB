class  NegativeNumberException extends Exception
{
	String details;
	NegativeNumberException(String s)
	{
		details=s;
	}
	public String toString()
	{
		return "NegativeNumberException ["+details+"]";
	}
}
class que12
{
	public static void main(String args[])
	{
		int n=-9;
		try
		{
			if(n<0)
				throw new NegativeNumberException("You should enter a positive number");
		}
		catch(NegativeNumberException e)
		{
			System.out.println("Caught "+e);
		}
	}
}	