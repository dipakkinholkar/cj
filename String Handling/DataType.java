import java.util.Scanner;
class DataType
{
 	String Data(String Data)
	{
	return ""+Data;
	}
public static void main(String []args)
	{
	Scanner scn=new Scanner(System.in);
	String code=scn.nextLine();
	DataType d1=new DataType();
	System.out.println(d1.Data(code));
	}
}