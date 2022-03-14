class overload
{
	static int add()
	{
		int a,b,c;
		a = 3;
		b = 4;
		c = a+b;
		return c;
	}
	static int add(int a, int b, int c)
	{
		int d;
		d = a+b+c;
		return d;
	}
	public static void main(String args[])
	{
		overload a = new overload();
		System.out.println("Addtion of three no is : " + a.add());
		System.out.println("Addtion of three no is : " + a.add(2,3,4));
	}
}