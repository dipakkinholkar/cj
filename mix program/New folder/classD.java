class classD
{
static a=10;
public void m1()
{
m2();
}
public void m2(int a)
{
m1();
}
public static void main(String args[])
{
classD c=new classD();
c.m1();
}
}