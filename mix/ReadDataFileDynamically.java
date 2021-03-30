import java.io.*;
class ReadDataFileDynamically
{
public static void main(String args[]) throws FileNotFoundException,IOException
{
FileInputStream fs=new FileInputStream("data.txt");
int data=0;
while(data>=0)
{
data=fs.read();
if(data==-1)
{
System.exit(0);
}
System.out.println("data:"+data+"\t"+(char)data);
}
fs.close();



}
}