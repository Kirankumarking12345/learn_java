import java.lang.String;
class StringConstructor{
public static void main(String args[])
{
char arr[]={'n','a','n','d','h','u'};
byte arr1[]={65,66,67,68,69,70};
String s1=new String();
System.out.println("k"+s1);
String s2=new String(arr);
System.out.println(s2);
/*String s3=new String("");
System.out.println(s3);*/
String str="oops";
String s3=new String(arr1,2,4);
System.out.println(s3);
}}