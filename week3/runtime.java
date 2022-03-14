class Poly
{
	void eat()
	{
		System.out.println("Super class eating");
	}
}
class Sub extends Poly
{
	void eat()
	{
		System.out.println("Sub class eating");
	}
}
class Polymorphism
{
	public static void main(String args[])
	{
		Poly k = new Poly();
		Sub  j = new Sub();
		Poly l;
		l =k;
		Sub n;
		n = j;
		l.eat();
		n.eat();
	}
}