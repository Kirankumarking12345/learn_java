import java.util.Scanner;
class Matricmulk
{
public static void main(String args[])
{
int a[][]=new int [3][3];
int b[][]=new int [3][3];
int c[][]=new int [3][3];
int i,j,k;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the elements of a array:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=obj.nextInt();
}
}
System.out.println("Enter the elements of b array:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=obj.nextInt();
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
for(k=0;k<3;k++)
{
c[i][j]= c[i][j]+a[i][k]*b[k][j];
}
}
}
System.out.println("Multiplication of two matrices is:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(c[i][j]+"   ");
}
System.out.println();
}
}
}