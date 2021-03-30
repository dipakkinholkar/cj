class Employee
{
String username="dipak";
String password="DIPAK";
}
class ShowhashCode
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
System.out.println("e1:"+e1.username);
System.out.println("e1:"+e1.password);

System.out.println("e1:"+e1.hashCode());
System.out.println("e2:"+e2.hashCode());

System.out.println("e2:"+e2.username);
System.out.println("e2:"+e2.password);

}
}