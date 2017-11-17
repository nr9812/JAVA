class A extends Thread
{
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Thread A: i is: "+i);
		}
		System.out.println("End of thread A");
	}

	public void run()
	{
		for (int j=0;j<5;j++)
		{
			System.out.println("Thread B: J is: "+j);
		}
		System.out.println("End of thread B");
	}

	public void run()
	{
		for (int k=0;k<5;k++)
		{
			System.out.println("Thread C: i is: "+k);
		}
		System.out.println("End of thread C");
	}

	public class ThreadTest
	{
		public static void main (String [] args)
		{
			A threadA = new A ();
			B threadA = new B ();
			C threadA = new C ();
			System.out.println ("End of main");

		}
	}

}