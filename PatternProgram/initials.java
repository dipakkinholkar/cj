// Java program to print initials of a name 
class initials { 
	
	static void printInitials(String name) 
	{ 
		if (name.length() == 0) 
			return; 

		System.out.print(Character.toUpperCase( 
			name.charAt(0))); 

		

		for(int j=5; j<name.length(); j++)
		{
		System.out.print(name.charAt(j)); 
		}		
		}	 

	// Driver code 
	public static void main(String args[]) 
	{ 
		String name = "dipak kinholkar"; 
		printInitials(name); 
	} 
} 

