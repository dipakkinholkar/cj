class Object1
{
}
class Object3 extends Object1
{

}
class Object2 extends Object1
{
}
public static void main(String args[])
{
Object1 obj=new Object1();
Object1 obj1=new Object1();
Object3 obj2=new Object();



System.out.println("class Object1=obj:"+obj);
System.out.println("class Object1=obj1:"+obj1);
System.out.println("class Object1=obj1:"+obj3);


}
}