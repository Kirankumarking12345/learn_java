
import java.lang.String;
class Stringoperations
{
public static void main(String []args)
{
	/*String name=new String("universe");
	System.out.println(name);
	byte[] stringarr={71,101,101,107,115};
	Charset cs=Charset.defaultcharset();
    String sbyte=new String(stringarr,0,3);
	System.out.println(sbyte);
	char ch[]={'g','o','o','d'};
	String s_ch= new String(ch,0,2);
	System.out.println(s_ch);
	int[] uni_code={71,101,101,107,115};
	String stuni=new String(uni_code,0,5);
	System.out.println(stuni);
	StringBuffer stb=new StringBuffer("geeks");
	String s= new String(stb);
	System.out.println(s);
	StringBuilder sb= new StringBuilder("akash");
	String s1= new String(sb);
	System.out.print(s1);*/
	String str=new String("UltimaTe");
	String s2="UltImate";
	System.out.println(str==s2);
	System.out.println(str.isEmpty());
	System.out.println(str.length());
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	System.out.println(str.trim());
	System.out.println(str.strip());
	System.out.println(str.concat(s2));
	System.out.println(str.charAt(3));
	System.out.println(str.codePointAt(2));
	System.out.println(str.codePointBefore(3));
	System.out.println(str.indexOf("ti"));
	System.out.println(str.indexOf('t',4));
	System.out.println(str.lastIndexOf("t"));
	System.out.println(str.replace('l','i'));
	System.out.println(s2.compareTo(str));
	System.out.println(s2.equals(str));
	System.out.println(s2.equalsIgnoreCase(str));
	
	
	
	
	
	
	
	
	
	
	
	
	
}}


