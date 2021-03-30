class MakeEvenNumberArray
{



	public int[] makeEven(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==1)
			{
			arr[i]+=1;
			arr[i+1]++;
			
			}

		}
	return arr;
	}

	public static void main(String args[])
	{
	int[] arr={1,2,21,34,43,23,323,345};

	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]);

	}
		System.out.println("--------------------------");

	MakeEvenNumberArray mena=new MakeEvenNumberArray();
	
	int[] cp=mena.makeEven(arr);
	
	for(int i=0; i<cp.length; i++)
	{
		System.out.println(cp[i]);
	}


	}


}


 
 
