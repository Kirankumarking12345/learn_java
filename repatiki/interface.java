interface Animal
{
	public void animalSound();
	public void sleep();
}
class Pig implements Animal
{
	public void animalSound()
	{
		System.out.println("The animal is sounding");
	}
	public void sleep()
	{
		System.out.println("The animal is running");
	}
	public static void main(String args[])
	{
		Pig mypig = new Pig();
		mypig.sleep();
		mypig.animalSound();
	}
}