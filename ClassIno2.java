class ClassIno
{
public void m1()
{
System.out.println("m11");
}
}
class ClassIno2 extends ClassIno
{
@Override
public void m1()
{
System.out.println("m1");
}
public static void main(String ars[])
{
ClassIno  c1=new ClassIno();
c1.m1();
ClassIno2  c2=new ClassIno2();
c2.m1();

}


}