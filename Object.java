class Object1
{
}
class Object2 extends Object
{
public static void main(String args[])
{
Object1 obj=new Object1();
Object1 obj1=new Object1();
obj=obj1;
System.out.println("class Object1=obj:"+obj);
System.out.println("class Object1=obj1:"+obj1);

}
}