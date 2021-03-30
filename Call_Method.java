 class Call_Method
{
int  call()
{
int a=10;
show();
return a;
}
void show()
{
System.out.println("helo");
}
public static void main(String args[])
{
Call_Method obj=new Call_Method();
obj.call();
}
}