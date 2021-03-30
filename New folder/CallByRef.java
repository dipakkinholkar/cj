class CallByRef
{
	int a=100;
	public void callRef(CallByRef c)
	{
	this.a=this.a+this.a;
	this.a=c.a+c.a;	
	}

	public static void main(String args[])
	{
	CallByRef c=new CallByRef();
	System.out.print(c.a);
	c.callRef(c);	
	System.out.print(c.a);
	
	}
}