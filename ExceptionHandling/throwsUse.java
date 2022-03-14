class test
{
	void division(int a, int b) throws ArithmeticException
	{
		int c= a/b;
		System.out.println(c);
	}
}
class Throws
{
	public static void main(String args[])
	{
		test obj=new test();
		try
		{
			obj.division(100,0);
		}
		catch(Exception s)
		{
			System.out.println("results infty : "+s);
		}
	}
}