abstract class Log
{
private String username;
private String password;
public String Log1(String user , String pass)
{
this.username=user;
this.password=pass;
return "Username:"+username+"Password:"+password;
}
}
class Login extends Log
{
public static void main(String args[])
{
Login l=new Login();
System.out.println(l.Log1("dipak","kadam"));
}
}