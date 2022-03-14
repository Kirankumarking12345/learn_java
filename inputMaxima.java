class CommandLineMaxima
{
	public static void main(String args[])
	{
		int maxValue =0;
		for (int i=0; i<args.length-1; i++)
		{
			if(Integer.parseInt(args[i]) > maxValue)
			{ 
				maxValue = Integer.parseInt(args[i]);
			}
		} 
		System.out.print("The maximum is :"+maxValue);
		
    } 
		
	
	
}
