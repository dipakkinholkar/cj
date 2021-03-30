interface A
{
public void add();
public void sub();
public void mul();
public void div();
public void max();
public void min();
}
interface B extends A
{
public void add();
public void sub();
public void mul();
public void div();
public void max();
public void min();
}
class Methodlist implements B,A
{
public void add()
{
System.out.println("add");
}
public void min()
{
System.out.println("add");
}
public void max()
{
System.out.println("add");
}
public void mul()
{
System.out.println("add");
}
public void div()
{
System.out.println("add");
}
public void sub()
{
System.out.println("add");
}
public static void main(String args[])
{
Methodlist m1=new Methodlist();
m1.add();
}
}