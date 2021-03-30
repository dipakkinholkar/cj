class Ref_Overload
{
void m1(Ref_Overload e)
{
System.out.println("E var");
}

void m1(Sample s)
{
System.out.println("Sample var");
}
void m1(String a)
{
System.out.println(a);
}
void m1(E e1)
{
System.out.println("e1");
}
}