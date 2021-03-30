// we can not overried final method in subclass which is extended.

class F_M1
{
void m1()
{
System.out.println("F_M:m1()");
}

 void m2()
{
System.out.println("F_M:m2()");
}


 void m3()
{
System.out.println("F_M:m3()");
}

}
class Final_Method1 extends F_M1
{

void m1()
{
System.out.println("Final_Method:m1()");
}

void m2()
{
System.out.println("Final_Method:m2()");
}


public static void main(String args[])
{
Final_Method1 f1=new Final_Method1();
System.out.println("Final_Method1 f1=new Final_Method1()");
f1.m1();
f1.m2();
f1.m3();
System.out.println("------------------------");

F_M f2=new Final_Method();
System.out.println("F_M f2=new Final_Method()");
f2.m1();
f2.m2();
f2.m3();

} 
}