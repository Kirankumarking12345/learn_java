import java.util.Scanner;
class Swapp
{
public static void main(String args[])
{
int a,b;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the vlaue of a:");
a=obj.nextInt();
System.out.println("Enter the vlaue of b:");
b=obj.nextInt();
System.out.println("Value of a And b Before Swapping "+a +b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("Value of a And b After Swapping "+a +b);
}
}