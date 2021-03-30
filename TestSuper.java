class TestSuper extends SuperKeyword
{
TestSuper()
{
super(10);
System.out.println("T no par con");
}
TestSuper(int a)
{
System.out.println("Test"+a);
}


public static void main(String args[])
{
TestSuper obj=new TestSuper();
}
}