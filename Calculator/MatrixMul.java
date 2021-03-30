class MatrixMul
{
public static void main(String args[])
{
int[][] row={
		{1,2,3},
		{4,5,6},
		{7,8,9}
	    };

int[][] col={
		{9,8,7},
		{6,5,4},
		{3,2,1}		
	    };

for(int i=0; i<row.length; i++)
{
	for(int j=0; j<col.length; j++)
	{
	System.out.println(i+":"+j+":"+row[i][j]+""+col[i][j]);
	}
	System.out.println("");
}


}
}