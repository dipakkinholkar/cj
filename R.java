import java.util.Scanner;
class R
{
static int i=0;
static void m1()
{
i++;
m2(i);
}
static void m2(int i)
{
i++;
m3(i);
}
static void m3(int i)
{
i++;
System.out.println(i);
m1();
}



public static void main(String args[])
{
R r1=new R();
r1.m1();

}
}