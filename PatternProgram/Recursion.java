class Recursion
{
 static int i=0;
public static void callme()
{
i++;
callme();
if(i==100)
System.out.println(i);
System.exit(0);
}

public static void main(String args[])
{
Recursion r=new Recursion();
r.callme();
}
}