class Test
{
private int x;
Test(int x)
{
this.x=x;
}
@Override
public int hashCode()
{
return x;
}
public int JVM()
{
return super.hashCode();
}
}
class RetrieveJVMhashCode
{
public static void main(String args[])
{
Test t1=new Test(10);
System.out.println(t1.hashCode()); //10
System.out.println(t1.JVM()); //366712642
System.out.println(System.identityHashCode(t1)); //366712642


Test t2=new Test(20);

System.out.println(t2.hashCode()); //20
System.out.println(t2.JVM()); //1829164700
System.out.println(System.identityHashCode(t2)); //1829164700

}
}