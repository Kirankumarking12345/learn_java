class Box
{
	double width;
	double length;
	double height;
	
	double volume()
	{
		double vol = width*length*height;
		return vol;
	}
}
class BoxDemo1
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		Box b2 = new Box();
		double volume;
		
		b1.width = 10;
		b1.length= 20;
		b1.height= 30;
		
		System.out.println(b1.volume());
		
		b2.width = 1;
		b2.length= 2;
		b2.height= 3;
		
		System.out.println(b2.volume());
		
	}
}