class ThreadDemo
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println("\n\nCurrent Thread: "+t);
		t.setName("RGUKT");
		System.out.println("\n\nAfter Name Change: "+t+"\n");
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(" "+i+"\n");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("\n\nMain Thread Interrupted");
		}
	}
}