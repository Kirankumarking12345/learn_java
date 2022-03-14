class Box
{
	double width;
	double height;
	double length;
	
}
class BoxDemo
{
	public static void main(String args[])
	{
		Box b = new Box();
		double volume;
		
		b.width		= 10;
		b.length	= 10;
		b.height	= 10;
		
		volume = b.width*b.length*b.height;
		
		System.out.println("Volume : "+ volume);
	}
}