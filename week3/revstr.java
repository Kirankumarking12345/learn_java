import java.lang.String;
import java.util.Scanner;
class Revstr
{
	public static void main(String args[])
	{
		String arr;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the String");
		arr=a.nextLine();
		char k[] = arr.toCharArray();
		for(int i=k.length-1; i>=0; i--)
		{
			
			System.out.print(k[i]);
		}
		
	}
}