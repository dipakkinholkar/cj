import java.util.Scanner;
class Send
{
void PrintMsg(String msg)
{
Scanner scn=new Scanner(System.in);
System.out.print("user1:");
String Msg=scn.nextLine();
Call();
}
void Call()
{
Scanner scn=new Scanner(System.in);
System.out.print("user2:");
String Msg=scn.nextLine();
PrintMsg(Msg);
}


public static void main(String args[])
{
Send u1=new Send();
u1.Call();
}
}