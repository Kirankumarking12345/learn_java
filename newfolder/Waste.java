class Waste
{
	public static void main(String args[])
	{
		
		Dummy d = new Dummy();
		d.k();
	}
}
class Dummy
{
	char k()
	{
		System.out.println("kiran");
		return k();
	}
}