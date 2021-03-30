
public class Print_Non_Static_Var_Values_By_Creating_Object {

	int a=10;  // a is non-static variable if want print a then create object of that class.
	
	//System.out.println(a); cannot print the a NSV var value outside the the main method. 
	
	public static void main(String[] args) {

Print_Non_Static_Var_Values_By_Creating_Object   aa=new  Print_Non_Static_Var_Values_By_Creating_Object();
		
   System.out.println(aa.a); 
      // NSV name and Object_name are same then JVM prints object value.
   
	}

}
