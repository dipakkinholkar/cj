class T
{
final  int a=10;
}

class Final_3_Var extends T
{
final int a=20;

public static void main(String args[])
{

Final_3_Var f1=new Final_3_Var();
System.out.println(f1.a); // 20

T f2=new T();
System.out.println(f2.a); // 10

System.out.println(this.a); // not work
System.out.println(super.a); // not work

}
}