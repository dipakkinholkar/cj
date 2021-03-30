import java.util.Scanner;

class FindString
{
	public boolean findString(String find ,String[] arr)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			
			if(arr[i].equals(find))
			{
			return true;		
			}
	
		}


return false;
	}

	public static void main(String args[])	
	{
	Scanner scn=new Scanner(System.in);
	FindString fs=new FindString();
	System.out.println("Enter String :");
	String find=scn.next();
	String[] arr={"dipak","laxman","ram","prakash","sadashiv","amol","rangnath","vittal","raju"};
	System.out.print(fs.findString(find,arr));
	}
	



}