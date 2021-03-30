class GenMatrix
{


public static void main(String args[])
{

 int row[][]={
		{0,0},
		{0,0}

		};


for(int i=0; i<row.length; i++)
{
	for(int j=0; j<=i; j++)
	{
	row[i][j]=i+j;
	}	
}



for(int i=0; i<row.length; i++)
{
	for(int j=0; j<=i; j++)
	{
	System.out.println(i+":"+j+":"+row[i][j]);
	}	
}


}
}