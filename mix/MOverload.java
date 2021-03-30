class MOverload
{
public void m1(int a)
{
System.out.println("m1:"+a);
}

public void m1()
{
System.out.println("m1");
}

	public static void main(String args[])
{
MOverload m=new MOverload();

m.m1();
m.m1('a');
m.m1(10);


}

}

