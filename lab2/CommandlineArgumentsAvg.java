class CommandlineArgumentsAvg
{
public static void main(String args[])
{
int i;
float sum=0,no=0;
float  n;
float avg;
for (i=0;i<args.length;i++)
{
n=Float.parseFloat(args[i]);
sum=sum+n;
no=no+1;
}
System.out.println(sum + no);
avg=sum/no;
System.out.println("Average Of Array Of Elemets Using Command Line Arguments is: "+avg);
}
}