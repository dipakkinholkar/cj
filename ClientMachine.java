import java.io.*;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
public class ClientMachine{

public static void main(String args[]) throws Exception
{
String ip="localhost";
int port=1111;
Socket s=new Socket(ip,port);
String str="Hello Server";
OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
PrintWriter out=new PrintWriter(os);
os.write(str);






}


}