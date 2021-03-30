import java.util.Scanner;

public class Char_Comparison_By_Using_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char[] s1=s.next().toCharArray();
		char[] s2={'a','b','c','d','e'};
		for(int i=0; i<=s1[i]-1; i++)
		{
		for(int j=0; j<=s2[i]-1; j++)
		{
			
			if(s1[i]==s2[j])
			{
				System.out.println("match found");
			}
			else
			{
				System.out.println("match not found");
					
			}	
		}
					
		}	


	}

}
