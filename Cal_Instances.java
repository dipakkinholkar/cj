import java.io.*;
class Cal_Instances
{
public static int i = 0; 
					// constructor of class which counts 
					//the number of the objects of the class. 
	Cal_Instances() 
	{ 
		i++; 
		
	} 
			// static method is used to access static members of the class 
			// and for getting total no of objects 
			// of the same class created so far 
	int get() 
	{ 
	return i;
			// statements to be executed....  
	} 
public static void main(String args[])
{
Cal_Instances obj=new Cal_Instances();
Cal_Instances j=new Cal_Instances();
int b=obj.get();
System.out.println(b);
}
}