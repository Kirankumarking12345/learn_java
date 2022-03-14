import java.util.Scanner;
class Average
{
    public static void main(String args[])
	{	
        int n,k,a=0;
		double res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many numbers to calculate average:");
		n=sc.nextInt(); 
		System.out.println("Enter   "+n+"  numbers:"); 
        for(int i=0;i<n;i++)
		{
 	       
		   k=sc.nextInt();
		   a=a+k;
		}   
		System.out.println("average="+(a/n));
 
     }

}