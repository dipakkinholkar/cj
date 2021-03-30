class CreateObjectTest
	{

	public static void main(String args[])
		{

		CreateO o1=new CreateO();		
			System.out.println(o1);	
		CreateO o2=(CreateO)o1.getObj();
			System.out.println(o2);	
			
		System.out.println(o1==o2);	
		
		}	
	



}