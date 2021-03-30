import java.io.*;
import java.net.*;
class Server
{
public static void main(String args[])
{
try{
ServerSocket ss=new ServerSocket(1201);
Socket s=ss.accept();
DataInputStream din=new DataInputStream(s.getInputStream());
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
String mesgin="";
String mesout="";
while(!mesgin.equals("end"))
{
mesgin=din.readUTF();
System.out.println(mesgin);
mesout=br.readLine();
dout.writeUTF(mesout);
dout.flush();
}
s.close();
}
catch(Exception e)
{
System.out.println("error");
}
}
}
