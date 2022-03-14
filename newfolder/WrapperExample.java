public class WrapperExample
{
	public static void main(String args[])
	{
		byte 	b= 10;
		short 	s= 35;
		int 	i= 40;
		long	l= 890;
		float	f= 40.0f;
		double	d= 50.0d;
		char	c= 'k';
		boolean b2=true;
		
	//Auto boxing
		Byte byteobj	=b;
		Short shortobj	=s;
		Integer intobj	=i;
		Long longobj	=l;
		Float floatobj	=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=b2;
		
	//printing of objects
		System.out.println("The objects are :");
		System.out.println("Byte object :"+byteobj);
		System.out.println("short object:"+shortobj);
		System.out.println("integer object"+intobj);
		System.out.println("long object :"+longobj);
		System.out.println("float object :"+floatobj);
		System.out.println("double object :"+doubleobj);
		System.out.println("Charcter object:"+charobj);
		System.out.println("Boolean object:"+booleanobj);
	
	//Auto unboxing
		byte 	g= b;
		short 	k= s;
		int 	j= i;
		long	m= l;
		float	e= f;
		double	z= d;
		char	h= c;
		boolean b3=b2;	
	
	//printing primitives
		System.out.println("The objects are :");
		System.out.println("Byte datatype :"+g);
		System.out.println("short datatype:"+k);
		System.out.println("integer datatype"+j);
		System.out.println("long datatype :"+m);
		System.out.println("float datatype :"+e);
		System.out.println("double datatype :"+z);
		System.out.println("Charcter datatype:"+h);
		System.out.println("Boolean datatype:"+b3);	
	
	
	}
}
		