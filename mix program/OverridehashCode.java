class hashcode
{
int a=10;
int b=20;
@Override
public int hashCode()
{
return a+b;
}
}
class OverridehashCode
{
public static void main(String args[])
{
hashcode h1=new hashcode();
System.out.println(h1.hashCode());//30
hashcode h2=new hashcode();
System.out.println(h2.hashCode());//30
}
}