interface Operation
{
public void sub();
}
interface Operation1
{
public void sub();
}
class AnoInnClass
{
	
	public interface Operation
	{
	public void add();
	}
		public void sub()
		{
			System.out.println("sub");		
		}

		
		
	
	class ImplementClass
	{
		public void add()
		{
			System.out.println("add");
		}
		
		public void sub()
		{
			System.out.println("sub");
		}			
				
	};
	
	public static void main(String args[])
	{
		AnoInnClass a=new AnoInnClass();
		
		AnoInnClass.ImplementClass obj=a.new ImplementClass();
		obj.add();
		obj.sub();
		
		
		a.sub();
		
		
		
	}
	


}
