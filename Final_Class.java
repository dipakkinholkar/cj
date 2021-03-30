// we can access super class non-static member  by using subclass object.
// we can access super class non static member by using itself object in subclass.
class F_Class
{
int x=10;
}

class Final_Class extends F_Class
{
public static void main(String args[])
{
Final_Class f1=new Final_Class();
System.out.println(f1.x);
F_Class f2=new F_Class();
System.out.println(f2.x);

System.out.println(f1.x==f2.x);// true
System.out.println(f2);
System.out.println(f1);
System.out.println(f2==f1);  //false



}
}