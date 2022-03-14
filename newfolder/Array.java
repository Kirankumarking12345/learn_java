import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		//Single dimensional arrays
		//Declaration of array
		int arr[]= new int[5];
		//Basic initialization
		int a[] ={2,1,2,12,4,23,2};
		System.out.println(a);
		
		//Another type of intialization
		Scanner ele = new Scanner(System.in);
		int b[],i;
		System.out.println("Enter the elements of array:");
		for(i=0; i<=5; i++)
		{
			System.out.print("Enter the element:");
			a[i] = ele.nextInt();
		}
			System.out.println("The elements of the array is:\n");
		for(i=0; i<=5; i++)
		{
			System.out.println(a[i]);
		}
		//Multi dimensional arrays
		int c[][]={{1,2,3},{6,4,2},{9,8,7}};
		
		//Another type of initialization
		int d[][]= new int[3][3];
		int j;
		System.out.println("Enter 3 X 3 matrix :");
		
		for(i=0; i<4; i++)
		{
			for(j=0; j<4; j++)
			{
				System.out.println("Enter the element");
				d[i][j] = ele.nextInt();
			}
		}
		System.out.println("The 3 X 3 matrix is :");
		for(i=0; i<4; i++)
		{
			for(j=0; j<4; j++)
			{
				System.out.print(d[i][j]);
				
			}
			System.out.println();
		}		
		
		
	}
}