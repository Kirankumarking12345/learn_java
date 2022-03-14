import java.util.Scanner;
class Matrix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of row and colums:");
		int r;
		int i;
		int j;
		int k;
		r = sc.nextInt();
		int a[][] = new int[r][r];
		int b[][] = new int[r][r];
		int c[][] = new int[r][r];
		int d[][] = new int[r][r];
		System.out.println("Enter the matrix a:");
		for(i=0; i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the matrix b:");
		for(i=0; i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		// Matrix addtion
		
		for(i=0; i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Matrix a:");
		for(i=0; i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("Matrix b:");
				for(i=0; i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("Addtion of matrix a and b:");
		for(i=0; i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(c[i][j] +" ");
			}
			System.out.println(" ");
		}
		//matrix multiplication
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				for(k=0;k<r;k++)
				{
					d[i][j] = a[i][k]*b[k][j] + d[i][j];
				}
			}
		}
		
		System.out.println("Multiplication of matrix a and b:");
		for(i=0; i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				System.out.print(d[i][j] +" ");
			}
			System.out.println(" ");
		}
	}
}