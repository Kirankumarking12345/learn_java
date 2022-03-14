import java.util.Scanner;
class Simpleinterest
{
	public static void main(String args[])
	{  
		Scanner sc=new Scanner(System.in);
		int p,t,i;
		float r;
		System.out.println("Enter the pricipal amount:");
		p=sc.nextInt();
		System.out.println("Enter the time duration:");
		t=sc.nextInt();
		System.out.println("Enter the rate of interest:");
		r=sc.nextFloat(); 
		System.out.println("The simple interest is: "+(p*t*r)/100);
	}
}  
  