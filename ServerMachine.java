import java.net.Socket;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ServerMachine
{
public static void main(String args[])
{
System.out.print("server is started");
ServerSocket ss=new ServerSocket(1111);
Socket s=ss.accept();
System.out.println("Client Connected");
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
String str=br.readLine();
System.out.println("clint Data"+str);


}



}