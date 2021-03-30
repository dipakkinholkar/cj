import pkg.Sub;
class MainClass
{
public static void main(String args[])
{
Sub obj=new Sub();

int b=obj.sum(10,20);
int c=obj.sub(10,34);
System.out.println("sum :"+b);
System.out.println("sub :"+c);
}
}