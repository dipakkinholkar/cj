import java.util.Scanner;

class FindSpeed
{
     public FindSpeed(float distance ,int time)
	{
	
		int speed=(int)distance/time;
	
	System.out.println(speed);
	
	}
	public static void main(String args[])
	{
	
	new FindSpeed(100f,10);	
	
	}

}