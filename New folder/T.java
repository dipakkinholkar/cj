class A
{
 public A()
	{
	System.out.println("A"+this.hashCode());
	}
}

class B extends A
{
	public B()
	{
		System.out.println("B"+this.hashCode());
	}

}
class T  extends B
{
	public T()
	{
	System.out.println("T"+this.hashCode());

	}


	public static void main(String args[])
	{
	T a=new T();

		}
}

