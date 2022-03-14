class Main
{
	static void CheckAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Access denied");
		}
		else
		{
			System.out.println("Granted");
		}
	}
	public static void main(String args[])
	{
		CheckAge(15);
	}
}