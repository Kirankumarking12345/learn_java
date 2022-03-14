import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.String;
class StringBufferMethods
{
public static void main(String args[])
{
String s1;
Scanner obj=new Scanner(System.in);
s1=obj.nextLine();
char b='n';
StringBuffer str=new StringBuffer("String Buffer Methods");
StringBuffer s2=new StringBuffer("String Buffers");
System.out.println(str.compareTo(s2));
System.out.println(str.length());
System.out.println(str.capacity());
System.out.println(str.charAt(6));
//System.out.println(str.setLength(10));
System.out.println(str.append(s2));
System.out.println(str.append(3));
System.out.println(str.insert(3,s1));
System.out.println(str.insert(4,b));
System.out.println(str.reverse());
System.out.println(str.deleteCharAt(3));
}
}