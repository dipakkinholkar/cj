class CallByValue
{
	int no=100;
		
	public void callValue(int no)
	{
	this.no=no+100;
	}	



	public static void main(String args[])
	{
	CallByValue c=new CallByValue();
	System.out.print(c.no);	
	c.callValue(100);
	System.out.print(c.no);	
	


	}


}


