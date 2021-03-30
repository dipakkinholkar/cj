import java.util.Scanner;
class MCall
{
	public void m1(String a[][])
	{
	
	for(int i=0; i<a.length; i++)
	{
		System.out.println("");
		for(int j=0; j<a.length; j++)
		{
		System.out.print("["+a[i][j]+"]");
		}
			
	} 

	
	}
public static void main(String args[])
{
/*
String a[][]={
	{"101","Kadam","Dipak","Maroti","M.sc","Pbn"},
	{"102","Yellam","Abhinandan","Kishanrao","BE","Nagar"},
	{"103","Agnihotri","Yogesh","Malharrao","B.sc","Pune"},
	{"104","Pedgoankar","Anurag","Ashok","B.sc","Pbn"},
	{"105","Dange","Vishwambher","Madhukar","M.sc","Pbn"},
	{"106","Giram","Akash","Panditrao","M.sc","Pbn"}
	};
*/
String a[][]=new String[4][4];
Scanner scn=new Scanner(System.in);

	for(int i=0; i<a.length; i++)
	{
		for(int j=0; j<a.length; j++)
		{
		System.out.println("Enter id:");
		a[i][j]=scn.next();
		}
	}



MCall m=new MCall();
m.m1(a);
}
}