import java.util.Scanner;
class Throwuse
{
	public static void main(String args[])
	{	
		Scanner read=new Scanner(System.in);
		System.out.print("Enter age: ");
		int age=read.nextInt();
		try
		{
			if(age<18)
				throw new Exception("Not eligible to vote");
			else
				System.out.println("Eligible to vote");
		}
		catch(Exception a)
		{
			System.out.println(a);
		}
	}
}
			