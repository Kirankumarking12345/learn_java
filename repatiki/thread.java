public class Main extends Thread
{
	public static void main(String args[])
	{
		Main thread =new Main();
		thread.start();
		System.out.println("This code is out sid the thread");
	}
	public void run()
	{
		System.out.println("The cod run in thread");
	}
}