import java.io.*;
import java.net.*;
import java.util.*;
class MyServer
{

public final static int PORT=10;

public MyServer()
{
try{
	ss=new ServerSocket(PORT);
	System.out.println("Server Started "+ss);
	while(true)
	{
	s=ss.accept();
	}
   }
catch(Exception e){System.err.println("Server constructor"+e);}
}
/////////////////////////
public static void main(String [] args)
{
new MyServer();
}
/////////////////////////
}
/*************************/
class MyThread implements Runnable
{
Socket s;
///////////////////////
try{
	DataInputStream dis=new DataInputStream(s.getInputStream());
    }
catch(Exception e){System.err.println("MyThread constructor  "+e);}
}
///////////////////////
public void run()
{
String s1;
try{
	DataInputStream dis=new DataInputStream(s.getInputStream());
	do
	{
	}
	while(true);
	DataOutputStream tdos=new DataOutputStream(s.getOutputStream());
	tdos.flush();

   }
catch(Exception e){System.out.println("MyThread Run"+e);}
}

public void tellEveryOne(String s1)	
{
Iterator i=al.iterator();
while(i.hasNext())
{
try{
	Socket temp=(Socket)i.next();
	DataOutputStream dos=new DataOutputStream(temp.getOutputStream());
	dos.writeUTF(s1);
	dos.flush();
	//System.out.println("sent to : "+temp.getPort()+"  : "+ s1);
   }
catch(Exception e){System.err.println("TellEveryOne "+e);}
}
}
///////////////////////
}
/*********************************/
class MyClient implements ActionListener
{
Socket s;
DataInputStream dis;
DataOutputStream dos;


try{
	dos.writeUTF(txtMessage.getText());
	txtMessage.setText("");
     }
catch(Exception excp){txtBroadcast.append("\nsend button click :"+excp);}
}
if(temp==loginButton)
{
String uname=JOptionPane.showInputDialog(chatWindow,"Enter Your lovely nick name: ");
if(uname!=null)
	clientChat(uname); 
}
if(temp==logoutButton)
{
if(s!=null)
	logoutSession();
}
if(temp==exitButton)
{
if(s!=null)
{
JOptionPane.showMessageDialog(chatWindow,"u r logged out right now. ","Exit",JOptionPane.INFORMATION_MESSAGE);
logoutSession();
}
System.exit(0);
}
}
///////////////////////////
public void logoutSession()
{
if(s==null) return;
try{
dos.writeUTF(MyServer.LOGOUT_MESSAGE);
Thread.sleep(500);
s=null;
}
catch(Exception e){txtBroadcast.append("\n inside logoutSession Method"+e);}

logoutButton.setEnabled(false);
loginButton.setEnabled(true);
chatWindow.setTitle("Login for Chat");
}
//////////////////////////
public void clientChat(String uname)
{
try{
     s=new Socket(InetAddress.getLocalHost(),MyServer.PORT);
     dis=new DataInputStream(s.getInputStream());
     dos=new DataOutputStream(s.getOutputStream());
     ClientThread ct=new ClientThread(dis,this);
     Thread t1=new Thread(ct);
     t1.start();
     dos.writeUTF(uname);
     chatWindow.setTitle(uname+" Chat Window");
    }
catch(Exception e){txtBroadcast.append("\nClient Constructor " +e);}
logoutButton.setEnabled(true);
loginButton.setEnabled(false);
}
///////////////////////////////
public MyClient()
{
  	displayGUI();
//	clientChat();
}
///////////////////////////////
public static void main(String []args)
{
new MyClient();
}
//////////////////////////
}
/*********************************/
class ClientThread implements Runnable
{
DataInputStream dis;
MyClient client;

ClientThread(DataInputStream dis,MyClient client)
{
this.dis=dis;
this.client=client;
}
////////////////////////
public void run()
{
String s2="";
do
    {
	try{
		s2=dis.readUTF();
		if(s2.startsWith(MyServer.UPDATE_USERS))
			updateUsersList(s2);
		else if(s2.equals(MyServer.LOGOUT_MESSAGE))
			break;
		else
			client.txtBroadcast.append("\n"+s2);
		int lineOffset=client.txtBroadcast.getLineStartOffset(client.txtBroadcast.getLineCount()-1);
		client.txtBroadcast.setCaretPosition(lineOffset);
	     }
	catch(Exception e){client.txtBroadcast.append("\nClientThread run : "+e);}
   }
while(true);
}
//////////////////////////
public void updateUsersList(String ul)
{
Vector ulist=new Vector();

ul=ul.replace("[","");
ul=ul.replace("]","");
ul=ul.replace(MyServer.UPDATE_USERS,"");
StringTokenizer st=new StringTokenizer(ul,",");

while(st.hasMoreTokens())
{
String temp=st.nextToken();
ulist.add(temp);
}
client.usersList.setListData(ulist);
}
/////////////////////////
}
/*********************************/
