class Static1
{
	static{System.out.println("Static1");}
}
class Static2 extends Static1
{
	static{System.out.println("Static2");}
}

class StaticBlockTest extends Static2
{
	static{System.out.println("Static3");}
	public static void main(String args[])
	{
		StaticBlockTest s=new StaticBlockTest();
		
	
	}

}