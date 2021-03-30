interface I
{
public void m1();
public void m2();
public void m3();
}

class D implements I
{
public void m1()
{
System.out.println("m1");
}

public void m2()
{
System.out.println("m2");
}

public void m3()
{
System.out.println("m3");
}
public static void main(String args[])
{
	I i=new D();
 
i.m1();
i.m2();
i.m3();
}
}
