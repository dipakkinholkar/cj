class Super_Class
{
Super_Class()
{
System.out.println("Super_Class");
}
}
class Sub_Class_A extends Super_Class
{
Sub_Class_A()
{
System.out.println("Sub_Class_A1");
}
}

class Test_Super_Class extends Sub_Class_A
{
public static void main(String args[])
{
Test_Super_Class obj=new Test_Super_Class();

}
}

