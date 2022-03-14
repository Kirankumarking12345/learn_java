import java.lang.String;
public class StringPool{
public static void main(String[] args){
String s1=("Rat");
String s2=("Rat");
String s3=new String("Rat");
System.out.println("s1==s2:"+(s1==s2));
System.out.println("s1==s3:"+(s1==s3));
}}