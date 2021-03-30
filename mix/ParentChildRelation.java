class Parent
{
public void m1()
{
System.out.println("Parent");
}

}
class Child extends Parent
{
public void m2()
{
System.out.println("child");
}

}

class ParentChildRelation
{
public static void main(String args[])
{
Parent p=new Parent();
p.m1();
// p.m2();  // we can not call by using object of parent class

Parent p1=new Child();

p1.m1();
// p1.m2() we can not call by using referance of parent class with object of child class.

Child c=new Child();
c.m1();
c.m2();
Child c1=new Parent(); // we can not assign the object to Child referance variable. Parent cannot be converted to Child


}
}