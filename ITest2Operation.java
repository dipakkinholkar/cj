interface ML
{
public void add(int a ,int b);
public void sub(int a , int b);
public int show(int a, int b);
}
abstract class AC implements ML
{
public void add(int a, int b)
{
int c=a+b;
System.out.println("add():"+c);
}
public int show(int a, int b)
{
System.out.println("show():a:"+a);
System.out.println("show():b:"+b);
return a+b;
}
public abstract void sub(int a, int b);
}

class ITest2Operation extends AC
{
public void sub(int a , int b)
{
int c=a-b;
System.out.println("sub():"+c);
}

public static void main(String args[])
{
ITest2Operation i=new ITest2Operation();

i.add(10,20);
i.sub(10,20);
i.show(10,20); 
System.out.println(i.show(20,30)); //50
}
}   
