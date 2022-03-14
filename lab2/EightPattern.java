class EightPattern
{
public static void main(String args[])
{
int n=8,i,j;
for(i=1;i<=9;i++)
{
	if(i%2==0)
	{
		System.out.println(" ");
	}
	else
	{
		for(j=1;j<=i;j++)
	{
		if(j%2==0)
		{
		System.out.print(" ");
		}
		else
		{
			System.out.print("8");
		}
	}
	}
}
}
}