class MatrixRotate
{
	  public void PrintA(int[][] a)
	{
		
		for(int i=a.length-1; i>=0; i--)
		{
			for(int j=a.length-1; j>=0; j--)
			{ 
			System.out.print(a[i][j]+" ");
			}	
			System.out.println("");		
		}

		
	}


	public static void main(String args[])
	{
		MatrixRotate m=new MatrixRotate();
		int a[][]={{1,2},{3,4}};
		
		m.PrintA(a);
		

	}
}