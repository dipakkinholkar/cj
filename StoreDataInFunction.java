import java.io.*;
public class StoreDataInFunction
{

 public  int  studentdata(int id,String name ,String city)
{
System.out.println("Your id"+id);
System.out.println("Your name"+name);
System.out.println("Your city"+city);
return 0;
}

public static void main(String args[])
{
int id;
String name;
String city;
StoreDataInFunction obj=new StoreDataInFunction();
obj.studentdata(1,"dipak","parbhani");

}
}