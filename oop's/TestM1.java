class M1
{
public void amount(int a)
{
System.out.println("M1:"+a);
}
}

class TestM1 extends M1
{
public void amount(int a)
{
System.out.println("TestM1:"+a);
}

public static void main(String args[])
	{
		TestM1 t=new TestM1();
		t.amount(100);
		

	}

}