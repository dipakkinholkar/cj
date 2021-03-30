interface ML
{
public void m1();
public void m2();
}
abstract class AC implements ML
{
public void m1()
{
System.out.println("m1");
}
public abstract void m2();
}

class ITest extends AC
{
public void m2()
{
System.out.println("m2");
}

public static void main(String args[])
{
ITest i=new ITest();


i.m1();
i.m2();

}
}   
