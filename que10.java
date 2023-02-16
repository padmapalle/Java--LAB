
class noarg extends Exception
{
	String details;
	noarg(String s)
	{
		details=s;
	}
	public String toString()
	{
		return "["+details+"]";
	}
}
class que10
{
	public static void main(String args[])
	{
		try
		{
			if(args.length==0)
				throw new noarg("no command line arguments");	
			String usn=args[0];
			String name=args[1];
			int marks[]=new int[3];
			marks[0]=Integer.parseInt(args[2]);
			marks[1]=Integer.parseInt(args[3]);
			marks[2]=Integer.parseInt(args[4]);
			if(marks[0]<0 || marks[1]<0 || marks[2]<0)
				throw new noarg("negative marks");
			System.out.println(usn+" "+name);
		}
		catch(noarg a)
		{
			System.out.println("Caught "+a);
		}
	}
}