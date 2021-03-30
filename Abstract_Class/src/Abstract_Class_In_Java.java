
public class Abstract_Class_In_Java {


	public static void main(String[] args) {

		Mahesh obj=new Dipak();
		obj.call();
		obj.move();
		obj.sleep();	
		
	}	
}
abstract class Mahesh 
{
	public void call()	
	{
	System.out.println("calling...");
	}	
	public abstract void move();
	public abstract void sleep();	
}
abstract class Ramesh extends Mahesh
{
	public void move()
	{
		System.out.println("moving...");
		
	}
}

class Dipak extends Ramesh
{
	public void sleep()
	{
		
		System.out.println("sleeping...");
		
	}
}

