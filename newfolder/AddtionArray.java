import java.util.Scanner;
class AddtionArray
{
	public static void main(String args[])
	{
		int n;double res=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many numbers to cal  average:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter "+n+" numbers:");
		for(int i=0;i<n;i++)
		{
 	       a[i]=sc.nextInt();
		}
		res=AddtionArray.CalAdd(a,n);     
		System.out.println("Average="+res);
 
    }
	
    static double CalAdd(int  a[],int n)
	{
		
		double res=0;
		for(int i=0;i<n;i++)
	       res =res+a[i];
 
		return res;
    }
}