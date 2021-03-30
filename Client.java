import java.io.*;
import java.net.*;
class Client
{
public static void main(String args[])
{

Socket s=new Socket("127.0.0.1",1201);
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String mesgin="";
String mesout="";
while(!mesin=equals("end"))
{
mesout=br.readLine();
dout.writeUTF(mesout);
mesgin=din.readUTF();
System.out.println(mesin);
}
}
}


