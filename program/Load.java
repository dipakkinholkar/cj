class Load
{
public static void main(String args[])
{
try
{
Class load=Class.forName("LoadClass");
Load l=(Load) load.newInstance();
}

catch(ClassNotFoundException cls)
{
System.out.println(cls);
}
catch(Exception e)
{
System.out.println(e);
}
}
}