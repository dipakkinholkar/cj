class FI_Method2
{
public static void main(String args[])
{
System.out.println("FI-Method2");
}
}

/*
class Final_Method3 extends FI_Method2
{
public static final void main(String args[])
{
System.out.println("Final-Method3");
}
}
*/
// we can not override  final main method in subclass 


class Final_Method2 extends FI_Method2
{
public static final void main(String args[])
{
System.out.println("Final-Method2");
}
}