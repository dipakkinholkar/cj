class CallCon
{
public static int i=0;
public CallCon()
{
i++;
}
public static void main(String args[])
{
CallCon cn=new CallCon();
System.out.println(i);
}
}