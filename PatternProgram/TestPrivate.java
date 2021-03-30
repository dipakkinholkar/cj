class PrivateMethod
{
private void m1()
{

System.out.println("PM");
}

}
class TestPrivate extends PrivateMethod
{
private void m1()
{
System.out.println("TP");
}
public static void main(String args[])
{
TestPrivate t=new TestPrivate();
t.m1();
}
}