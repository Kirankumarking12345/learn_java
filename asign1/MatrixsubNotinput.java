class MatrixsubNotinput
{
  public static void main(String args[])
  {
    int c, d;
    int first[][] = {{2,3},{1,4}};
    int second[][] = {{1,2},{4,6}};
    int sum[][] = new int[2][2];
	
	for (c = 0; c < 2; c++)
      for (d = 0; d < 2; d++)
        sum[c][d] = first[c][d] - second[c][d]; 

 

    System.out.println("Substraction of the matrices:");

    for (c = 0; c < 2; c++)
    {
      for (d = 0; d < 2; d++)
        System.out.print(sum[c][d] + "\t");

      System.out.println();
    }
  }
}