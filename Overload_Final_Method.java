// we can overload final method in subclass but with diff parameter.


class F_Method
{
final void m1(short a)
{
System.out.println("F_Method:m1:"+a);
}
final void m2(char a)
{
System.out.println("F_Method:m2:"+a);
}
}

class Overload_Final_Method extends F_Method
{
void m1(int a) 
{
System.out.println("O_F_M:m1:"+a);
}

public static void main(String args[])
{
Overload_Final_Method f1=new Overload_Final_Method();

f1.m1(10);
f1.m2('m');
}
}