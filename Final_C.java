final class F_C
{
int x=10;
}
class Final_C
{
 int x=20;

public static void main(String args[])
{

Final_C f1=new Final_C();
System.out.println(f1.x); //20



/*
err:F_C cannot be converted to Final_C
Final_C f3=new F_C();
System.out.println(f3.x);
*/
F_C f2=new F_C();
System.out.println(f2.x);// 10
}
}
