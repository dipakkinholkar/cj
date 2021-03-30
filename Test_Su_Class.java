class Test_Su_Class extends Super_Class
{
 static int a=30;
 int x=50;

static void m1()
{
System.out.println("Test m1");
}
void m2()
{
System.out.println("Test m2");
}
public static void main(String args[])
{
System.out.println("a"+a);
m1();
Test_Su_Class t1=new Test_Su_Class();
System.out.println("a"+t1.x);

t1.m2();
t1.m3();



}


}