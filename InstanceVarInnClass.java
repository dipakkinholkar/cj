class InstanceVarInnClass

{
	int a=10;
	static int b=20;
	
	static class AccessVar
	{
		System.out.println(b);
	}

	public static void main(String args[])
	{
	AccessVar v=new AccessVar();
	
	}
}