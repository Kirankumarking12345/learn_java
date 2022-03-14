import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			String a[] = new String[3];
			for(int i =0;i<a.length;i++)
			{
				System.out.println("Enter the element:");
				a[i]=sc.nextLine();
			}
			System.out.println(a[5]);
			
		}
		catch(Exception e)
		{
			System.out.println("Array is out of bound:"+e);
			
		}
		finally()
		{
			System.out.println("Every thing is finished");
		}
	}
}