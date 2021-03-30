class S2
{
	private static int id=100;
	
	public int getStr()
	{
	return this.id;	
	}
	public void setStr(int n)
	{
	this.id=n;
	}

}
class String2 // extends S2
{
	public static void main(String args[])
	{
	String2 s1=new String2();	
	S2 s=new S2();
	s.setStr(20);
	
	System.out.println(s.getStr());
	}
}