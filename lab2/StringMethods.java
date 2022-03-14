import java.util.Scanner;
import java.lang.String;
class StringMethods
{
public static void main(String args[])
{
Scanner str=new Scanner(System.in);
String s1,s2;
char b='a',k='n';
System.out.println("Enter String1:");
s1=str.nextLine();
System.out.println("Enter String2:");
s2=str.nextLine();
System.out.println(s1.length());
System.out.println(s1.isEmpty());
System.out.println(s1.charAt(3));
System.out.println(s1.codePointAt(3));
System.out.println(s1.codePointBefore(3));
System.out.println(s1.replace(b,k));
System.out.println(s1.toUpperCase());
System.out.println(s1.replaceAll(s1,s2));
System.out.println(s1.hashCode());
System.out.println(s1.indexOf(0));
System.out.println(s1.concat(s2));
//system.out.println(s1.compareTo(str));
//system.out.println(s1.equals(str));
}
}