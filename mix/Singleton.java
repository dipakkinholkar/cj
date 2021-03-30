class Singleton
{
private static Test t=new Test();

private Test()
{

}

public static void getTest();
{
return t;
}

public static void main(String args[])
{

Singleton s=new Singleton();

}
}