class Operation
{
	int addtion(int a, int b,char l)
	{
		int c;
		c = a+b;
		return c;
	}
	int addtion(int a, int b, int c,char e)
	{
		int d;
		d = a+b+c;
		return d;
	}
}
class Add extends Operation
{
	int addtion(int a, int b,char e)
	{
		int c;
		c = a+b;
		System.out.println("Overriding method");
		return c;
	}
	public static void main(String args[])
	{
		Add obj = new Add();
		int i = obj.addtion(2,3,'+');
		int j = obj.addtion(2,3,4,'+');
		System.out.println(i);
		System.out.println(j);
	}
}