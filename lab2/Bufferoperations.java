import java.lang.String;
class Bufferoperations
{
public static void main(String[]args)
{
StringBuffer str1= new StringBuffer("hello");
StringBuffer str2= new StringBuffer("world");
System.out.println(str1.length());
System.out.println(str1.capacity());//16 characters capacity=5+16,length=5
str1.append("existence");
System.out.println(str1);
str1.insert(2,"a");
System.out.println(str1);
str1.delete(1,3);
System.out.println(str1);
str1.reverse();
System.out.println(str1);
System.out.println(str1.charAt(2));
System.out.println(str2.codePointAt(2));
System.out.println(str2.codePointBefore(2));
System.out.println(str2.indexOf("r"));
System.out.println(str2.indexOf("rl"));
System.out.println(str2.equals(str1));


}}

