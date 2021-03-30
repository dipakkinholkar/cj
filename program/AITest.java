interface AI1
	{
	public void m1();
	}
interface AI2
	{
	public void m1();
	}

class AI3 implements AI1,AI2
{
public void m1()
{
System.out.println("m1");
}
}
class AITest extends AI3
{
public static void main(String ars[])
{
AITest m=new AITest();
AI3 m2=new AI3();
m2.m1();
m.m1();
}
}
