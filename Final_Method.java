class F_M
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
class Final_Method extends F_M
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
Final_Method f1=new Final_Method();
f1.m1();
f1.m2();
f1.m3();
System.out.println("------------------------");

F_M f2=new Final_Method();
f2.m1();
f2.m2();
f2.m3();
System.out.println("------------------------");

/* we can assign ref of super class to subclass.
Final_Method f3=new F_M();
f3.m1();
f3.m2();
f3.m3();
*/
} 
}