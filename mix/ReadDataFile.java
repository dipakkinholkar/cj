import java.io.*;
class ReadDataFile
{
public static void main(String args[]) throws FileNotFoundException,IOException
{
FileInputStream fs=new FileInputStream("data.txt");
int data=fs.read();
int data1=fs.read();
System.out.println("data:"+data);
System.out.println("data:"+data1);
fs.close();



}
}