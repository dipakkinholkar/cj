
public class String_All_Methods {

	public static void main(String[] args) {
		
			String s2="Dipak";
			String s3="parbhani is Dipak smart city im maharashtra.india";
		// codePointAt method is displays unicode character			
		for(int j=0; j<s2.length(); j++)
		{
		System.out.println(s2.codePointAt(j));
		}
	      
	boolean s=s3.contentEquals(s2);
		System.out.print(s);
		
	
	}

}
