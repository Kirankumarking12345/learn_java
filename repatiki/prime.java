import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int a;
		int i;
		int k;
		k=0;
		a = sc.nextInt();
		for(i=a;i>=0;i--)
		{
			
			if(i%a==0)
			{
				k =k+1;
			}
		}
		if(k==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}
			
			
		