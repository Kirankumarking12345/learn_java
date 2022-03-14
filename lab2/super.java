class A
{
	int i;
}
class B extends A
{
	int i;
	B(int a, int b)
	{
		super i=a;
		i=b;
	}
	void show()
	{
		System.out.println("i in super class:"+super.i);
		System.out.println("i in sub class:"+i);
	}
	class Usesuper
	{
		public static void main(String args[])
		{
			B ob = new B(1,2);
			ob.show();
		}
	}
}