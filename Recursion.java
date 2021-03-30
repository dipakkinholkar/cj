class Recursion
{
void A()
{
 show();
}

void show()
{

A();
}


public static void main(String args[])
{
Recursion call=new Recursion();
 call.A();
}
}