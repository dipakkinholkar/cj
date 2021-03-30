import java.util.Scanner;
class BigArray
{
public static void main(String args[])
{

Scanner scn=new Scanner(System.in);
int[] id=new int[5];
String[] name=new String[5];
String[] college=new String[5];
String[] sclass=new String[5];
String[] addr=new String[5];
String[] gender=new String[5];
String[] mob=new String[5];
String[] dob=new String[5];

System.out.println("ID:"+"\t"+"Name"+"\t"+"College"+"\t"+"Class"+"\t"+"Address"+"\t"+"Gender"+"\t"+"MobileNo"+"\t"+"BirthDate");
System.out.println("--------------------------------------------------------------------------");
	for(int i=0; i<id.length; i++)
		{
		id[i]=scn.nextInt();
		System.out.print("\t");
		name[i]=scn.next();
		System.out.print("\t");
		college[i]=scn.next();
		System.out.print("\t");
		sclass[i]=scn.next();
		System.out.print("\t");
		addr[i]=scn.next();
		System.out.print("\t");
		gender[i]=scn.next();
		System.out.print("\t");
		mob[i]=scn.next();
		dob[i]=scn.next();
		System.out.println("");
		}

			
	
	for(int i=0; i<id.length; i++)
	{
	//System.out.println("");
//	System.out.println("---------------------------------------------------------------------------");
	System.out.println(id[i]+"|\t"+name[i]+"|\t"+college[i]+"|\t"+sclass[i]+"|\t"+addr[i]+"|\t"+gender[i]+"|\t"+mob[i]+"\t"+dob[i]);
	System.out.println("---------------------------------------------------------------------------");

	}


}
}