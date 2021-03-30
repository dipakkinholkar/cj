import java.util.Scanner;
import java.util.Date;
class New_Bill
{
String cust_name;
String pro_name;
int pro_price;
void data(){
Scanner scn=new Scanner(System.in);

System.out.print("Enter Customer Name :");
cust_name=scn.nextLine();

System.out.print("Enter Product Name :");
pro_name=scn.nextLine();

System.out.print("Enter Product Price :");
pro_price=scn.nextInt();

}


 void print_bill()
	{	
	System.out.println("customer name:"+cust_name);
	System.out.println("product name:"+pro_name);
	System.out.println("product price:"+pro_price);
	}
public static void main(String args[])
{

Date d1=new Date();
New_Bill c1=new New_Bill();
System.out.println("--New Customer Bill--Date:"+d1);
c1.data();
c1.print_bill();
}
}