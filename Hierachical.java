interface HybridInh
{
public abstract void show();
}
class ClassA implements HybridInh
{
public void show()
{
System.out.println("ClassA:");
}
}
class ClassB extends ClassA implements HybridInh
{
public void show()
{
System.out.println("ClassB:");
}
}
class ClassTest extends ClassB implements HybridInh
{
public static void main(String args[])
{
ClassTest c=new ClassTest();
c.show();

}
}