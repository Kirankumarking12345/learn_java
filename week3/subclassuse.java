class King
{
	void display(int a)
	{
		System.out.println("The result is :"+a);
	}
	public static void main(String args[])
	{
		King l = new King();
		Addtion a = new Addtion();
		Substraction b = new Substraction();
		l.display(a.add());
		l.display(b.sub());
		
	}
}
class Addtion extends King
{
	int add()
	{
		int a = 20;
		int b = 30;
		int c =a+b;
		return c;
		
	}
}
class Substraction extends King
{
	int sub()
	{
		
		int a = 30;
		int b = 10;
		int c = a-b;
		return c;
	}
}
