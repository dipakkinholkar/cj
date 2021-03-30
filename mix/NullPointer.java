class NullPointer1
{
public static int add(int a, int b)
{
return a+b;
}

public static void main(String args[])
{
NullPointer1 obj=null;

System.out.println(obj.add(10,20));

}
}