import java.util.Scanner;
class CustomArrayList
{

	public void addele(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}

	public void rem(int[] arr,int i)
	{
	arr[i]=0;
	
	for(i=0; i<arr.length; i++)
	{
	System.out.println(arr[i]);	
	}
	
	}


public static void main(String args[])
{
Scanner scn=new Scanner(System.in);

CustomArrayList c=new CustomArrayList();

							//int[] arr=new int[10];
int[] arr={10,20,30,40,50,60};

for(int i=0; i<arr.length; i++)
{
arr[i]=i;
}
							//int[] arr=new int[10];

c.addele(arr);
System.out.println("enter index for delete element:");


int no=scn.nextInt();
	System.out.println("------------------------------");
	
c.rem(arr,no);



}
}