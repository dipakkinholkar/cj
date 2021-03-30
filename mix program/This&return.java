class This&return
{
public int store(int a)
{
this.a=a;
}
public int show()
{
return a;
}

public static void main(String args[])
{
This&return t1=new This&return();
t1.store(10);
System.out.println(t1.show());
}
}