import java.util.Scanner;
class Fibonacci
{  
	public static void main(String args[])  
	{    
		int n1=0,n2=1,n3=0,n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");   
		n=sc.nextInt();
		for(i=0;i<=n;i++)  
		{    
			if(n3<n)
			{			   
				System.out.println(n3);    
				n1=n2;    
				n2=n3;
				n3=n1+n2;
			}
		}
	}
}