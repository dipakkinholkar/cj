import java.util.Scanner;
class StaticBlock
{

static{
int a=10;
int b=20;
System.out.println(a+b);
}

{ // we need object
System.out.println("hello");
}

{ // we need object
int a=10;
int b=20;
System.out.println(a+b);
}




int A(int a)
{
System.out.println("a="+a);

return a;
}




public static void main(String args[])
{

StaticBlock obj=new StaticBlock();
StaticBlock obj2=new StaticBlock();
//System.out.println(obj);
//System.out.println(obj2);

//obj2=obj;

//int c=obj.A(20);
//System.out.println("obj20"+c);
//int d=obj2.A(3);
//System.out.println("obj2 3"+d);

}
}