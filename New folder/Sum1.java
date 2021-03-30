interface Aa
{
public void sum();
}
interface Ba
{
public void sum();
}
class Sum1 implements Aa,Ba
{
public void sum()
{
System.out.print("sum");
}
public static void main(String args[])
{
Aa bb;
bb=new Sum1();
bb.sum();
}
}