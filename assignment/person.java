class Person
{
	Person()
	{
		int Psalary;
		int Ssalary;
	}
	public static void main(String args[])
	{
		
		Sprotsmen b = new Sportsman();
		Politician a = new Politician();
		System.out.println("The sportsman salary is :"+ b.salary);
		System.out.println("The Politician salary is :"+ a.salary);
	
	
	}
}
class Sportsmen extends Person
{
	Person a= new Person();
	a.Ssalary=250000;
	
}
class Politician extends Person
{
	Person b =new Person();
	b.Psalary=500000;

}
