import java.util.HashMap;
class NumtoChar
{
	public static void main(String args[])
	{
	int[] arr={1,2,3,4,5,6,7,8,9,0};

	HashMap hp=new HashMap();

	hp.put(1,"one");
	hp.put(2,"two");
	hp.put(3,"three");
	hp.put(4,"four");
	hp.put(5,"five");
	hp.put(6,"six");
	hp.put(7,"seven");
	hp.put(8,"eight");
	hp.put(9,"nine");
	hp.put(0,"zero");

	System.out.print(hp.get(10));	
	}

}