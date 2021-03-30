class Singleclass
{
	private Singleclass()
	{
	System.out.println("Singleclass");
	}


}

class SecondClass extends Singleclass
{
public static void main(String args[])
{
SecondClass sc=new SecondClass();
}
}