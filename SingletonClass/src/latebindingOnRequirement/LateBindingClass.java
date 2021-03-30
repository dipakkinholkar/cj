package latebindingOnRequirement;

public class LateBindingClass {

	private  static LateBindingClass l=null;
	
	private LateBindingClass()
	{
		
		
	}
	
	public static LateBindingClass getLateBindingClass()
	{
		if(l==null)
		{
			l=new LateBindingClass();
		}
		
		return l;
	}
	
	public int addFunction(int a , int b)
	{
		
		return a+b;
	}
	
}
