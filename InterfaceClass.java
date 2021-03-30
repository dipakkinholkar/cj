interface Human
{
public void Eye();
}

class A implements Human
{
public void Eye()
{
System.out.println("A Class");
}
}
class InterfaceClass   extends A implements Human
{
public void Eye()
{
System.out.println("Interface Class");
}
public static void main(String args[])
{
InterfaceClass obj=new InterfaceClass();
A obj1=obj;
obj.Eye(); //InterfaceClass
obj1.Eye(); //InterfaceClass
A obj3=new A();
obj3.Eye();
}
}