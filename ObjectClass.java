class Objectclass
{
public static void main(String args[])
{
Objectclass obj=new Objectclass();
System.out.println(obj);
System.out.println(obj.toString());
System.out.println(obj.hashCode());
System.out.println(obj.getClass());

Class c=obj.getClass();
System.out.println(c.getName());

}
}