import java.lang.String;
public class StringPool
{
	public static void main(String args[])
	{
		String s1 = "cat";
		String s2 = "cat";
		String s3 = new String("cat");
		String s4 = new String("cat");
		
		System.out.println("S1 == S2 :"+(s2==s4));
		System.out.println("S1 == S2 :"+s1.equals(s3));
		
	}
}
		