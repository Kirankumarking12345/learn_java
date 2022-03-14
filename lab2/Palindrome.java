import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
int n,sum=0,abj,temp;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the value of n:");
n=obj.nextInt();
temp=n;
//System.out.println(temp);
while(temp>0)
{
abj=temp%10;
sum=abj+sum*10;
temp=temp/10;
}
if(sum==n)
{
System.out.println("Given "+n+" is palindrome");
}
else
{
System.out.println("Given "+n+" is not palindrome");
}
}
}