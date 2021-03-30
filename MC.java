class MC
{

MC(int a)
{
System.out.println("constructor"+a);
}


static void m1()
{
System.out.println("E:m1"); 
}
static void m2(int a)
{
System.out.println("E:m2"+a); 
}
static void m3(float a)
{
System.out.println("E:m3"+a); 
}
void m4(String a)
{
System.out.println("E:m4"+a); 
}
public static void main(String args[])
{
MC a=new MC(10);
System.out.println("a"+a);
MC b=a;
System.out.println("b"+b);
System.out.println("-----------------------------------");
m1();
m2(10);
m3(10);
a.m4("dipak");
}
}