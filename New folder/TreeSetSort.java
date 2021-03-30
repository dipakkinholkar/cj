import java.util.TreeSet;
class TreeSetSort
{
	public static void main(String args[])
	{
		
	TreeSet ts=new TreeSet();
	ts.add(1);
	ts.add(2);
	ts.add(0);
	ts.add(6);
	ts.add(2); // duplicate not allowed
	ts.add(new String("dipak")); heterogenous not allowed

	System.out.println(ts);


	}

}