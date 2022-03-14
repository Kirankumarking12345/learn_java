class A
{
	int operation(int a,int b)
		{
			return a+b;
		}
	int operation(int a,int b, char c)
		{
			return a-b;
		}
	float operation(float a,float b, char c)
		{
			return a/b;
		}
	int operation(int a,int b, char c,char d)
		{
			return a*b;
		}
	public static void main(String args[])
	{
		A ob =new A();
		int a=10;
		int b=20;
		System.out.println(ob.operation(b,a));
		System.out.println(ob.operation(b,a,'-'));
		System.out.println(ob.operation(b,a,'*','m'));
		System.out.println(ob.operation((float)b,(float)a,'/'));
		
	}
}