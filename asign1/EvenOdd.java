import java.util.Scanner;
public class EvenOdd
{
	public static void main(String args[])
	{
		int a;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Its is even number");
		}
		else
		{
			System.out.println("Its is odd number");
		}
	}
}