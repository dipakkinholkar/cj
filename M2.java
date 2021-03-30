abstract class MethodList1
{
void m1()
{
System.out.println("m1");
}
abstract void m2();
}

abstract class M1 extends MethodList1
{
void m2()
{
System.out.println("m2");
}
}

class M2 extends M1
{
public static void main(String args[])
{
M2 m=new M2();
M2 ml1=m;

m.m1();
m.m2();

ml1.m1();
ml1.m2();

}
} 