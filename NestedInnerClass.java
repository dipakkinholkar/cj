class NestedInnerClass

{
	static class NestedInnerClassWM
		{
			static void m1()
			{
			System.out.println("m1");
			}
		public static void main(String args[])
		{
		NestedInnerClassWM obj=new NestedInnerClassWM();
		obj.m1();
		}
		
		}
public static void main(String args[])
{
	NestedInnerClass o=new NestedInnerClass();
	NestedInnerClass.NestedInnerClassWM m=new NestedInnerClassWM();
	m.m1();
	NestedInnerClassWM h=new NestedInnerClassWM();
	h.m1();
}	
}