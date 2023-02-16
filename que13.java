class A extends Thread
{
	public void run()
	{	
		System.out.println("Thread A");
		System.out.println("Thread A");
	}
}
class B extends Thread
{
	public void run()
	{	
		System.out.println("Thread B");
		System.out.println("Thread B");
	}
}
class C extends Thread
{
	public void run()
	{	
		System.out.println("Thread C");
		System.out.println("Thread C");
	}
}
class que13
{
	public static void main(String args[])
	{
		A ob1=new A();
		B ob2=new B();
		C ob3=new C();
		
		ob1.setPriority(Thread.MIN_PRIORITY);
		ob2.setPriority(Thread.MAX_PRIORITY);
		ob3.setPriority(ob3.getPriority()+1);
		ob1.start();
		ob2.start();
		ob3.start();
	}
}