import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner k = new Scanner(System.in);
		int x,y; int n;
		System.out.println("Enter the number you want the factorial:");
		n = k.nextInt();
		x = fact(n);
		System.out.println("Factorial : "+ x );
		y = factorial(n);
		System.out.println("Factorial by normal method: "+ y);
	}
	static int fact(int i)
	{
		if(i==0)
			return 1;
		else
			return i*fact(i-1);
	}
	static int factorial(int b)
	{
		int c =1;
		for(int i=1; i<= b; i++)
		{
			c = i*c;
		}
		return c;
	}
}