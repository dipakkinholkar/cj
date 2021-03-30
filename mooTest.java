interface Foo
{
	
	void sum();
	
}
interface Doo
{
	void mul();
}
class Moo implements Foo,Doo
{
	public void sum()
	{
		System.out.println("sum");
	}
	public void mul()
	{
		System.out.println("mul");
	}
}

class mooTest 
{
	public static void main(String args[])
	{
		Foo f;
		f=new Moo();
		f.sum();

		Doo d;
		d=new Moo();
		d.mul();
	}

}