class Sum
{
public void sum(int a,int b)
{
int c=a+b;
System.out.println(c);
}
}
class First extends Sum
{
public static void main(String args[])
{
First f=new First();
f.sum(10,20);
}
}
class Second extends Sum
{
public static void main(String args[])
{
Second s=new Second();
s.sum(10,20);
}

}