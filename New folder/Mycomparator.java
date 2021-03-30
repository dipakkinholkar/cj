import java.util.Comparator;


class Mycomparator implements Comparator
{
	public int compare(Object a , Object b)
	{
		if(a.equals(b))
		{
		return 0;
		}
		else if(!a.equals(b))
		{
		return 1;
		}
	return -1;
	}

public static void main(String args[])
{
	Mycomparator mc=new Mycomparator();
	System.out.print(mc.compare("hello","hello"));
}



}