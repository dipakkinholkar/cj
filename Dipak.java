import java.lang.reflect.Field; 
import java.lang.reflect.Method; 

public class Dipak
{

void M()
{

}


public static void main(String args[])
{

Dipak s1=new Dipak();		
Class c1 = s1.getClass(); 
Method m1=c1.getMethod();
System.out.println(m1.getName());

}
}