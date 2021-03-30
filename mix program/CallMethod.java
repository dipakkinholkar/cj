class CallMethod
{
public static void main()
{
System.out.println("main");
}
public static void main(int a[])
{
System.out.println(a[0]);
System.out.println(a[1]);
System.out.println(a[2]);

}
public static void main(String args[])
{
int b[]={10,20, 20};
CallMethod.main();
CallMethod.main(b);
}
}