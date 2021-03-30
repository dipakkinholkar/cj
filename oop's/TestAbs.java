class Abstraction
{
	public int accNo=45425412;
	public String uname="Naresh";
	private double balance=15415.0;

	
	
}

class TestAbs extends Abstraction
{
	public static void main(String []Char)
	{

		TestAbs t=new TestAbs();
		
		System.out.println(t.accNo+" : "+t.uname);
	}

}