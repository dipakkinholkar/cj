class Orr_M
{
 void m1()
{
System.out.println("Orr_M:m1:");
}
}

class Non_Final_M_Orr_Sub extends Orr_M
{
final void m1()
{
System.out.println("NFMOS:m1:");
}

public static void main(String args[])
{
Non_Final_M_Orr_Sub n1=new Non_Final_M_Orr_Sub();
n1.m1();
}
}