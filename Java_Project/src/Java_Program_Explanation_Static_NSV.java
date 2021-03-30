
public class Java_Program_Explanation_Static_NSV {

	static int a=10;
	       
	// we can not print the values of static or non-static variable in class without object.
	
	//we can not print the values of non-static variable in class without object .and also in main method.
	
	// if we trying to print the non-static variable in class but outside the main method . compiler will throgh error. 
	
	// if we want to print the values of non-static variable. we must create object of belonging non-static variable.
	
	
	 int b=20;
	
	public static void main(String[] args) {
		
		System.out.print(a);
		
		// System.out.print(b); // CTE .because we need object to print the value of non- static variable.
		
		
		
		
		

	}

}
