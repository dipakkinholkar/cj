class hasClass
{
	public void Machine(int code,String model)
	{
		System.out.println(code+""+model);
		
	}
	
	public void Details(int code,String model,String name,String addr)
	{
		
		System.out.println(code+""+model);
		System.out.println(name+""+addr);
	}
	
}

class hasRelation
{

	public static void main(String args[])
		{

		hasClass h=new hasClass();
		
		h.Machine(233223,"MH01D");
		h.Details(233223,"MH01D","dipak","pbn");


		}



}