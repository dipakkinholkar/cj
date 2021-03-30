class DBinding
{
	public void Dog()
	{
	System.out.print("Dog is Sleeping");
	}

}

class DynamicBinding extends DBinding
{
	public void Dog()
	{
	System.out.print("Dog is Walking");
	}



	public static void main(String args[])
	{
	DBinding db=new DynamicBinding();
	db.Dog();	
	
	}


}