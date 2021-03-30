class Final_4_Var
{
int a=10;
final int b=30;


public static void main(String args[])
{
Final_4_Var f1=new Final_4_Var();

System.out.println(f1.a=20); // we can change value of non-static var.

//System.out.println("final var before value a=30 then:"+f1.b=40); // we can not change final var value

}
}