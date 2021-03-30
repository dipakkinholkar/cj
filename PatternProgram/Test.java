class Test
{
	public static void main(String args[])
	{

	 E e=new E(6);
	 E e1=new E(6);
	 System.out.println(e1.equals(e));
 System.out.println(e1==e);

	}

}


class E
{
int x;
 public E(int x)
{
this.x=x;



}
//@Override
public boolean equals(Object obj)
	{
		if(obj instanceof E)
	{
		E e=(E)obj ;
	return (this.x==e.x);
	}
	return false;
	}

}