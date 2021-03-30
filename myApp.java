class myApp
{
	private EmailService es=new EmailService();

public void sendMessage(String msg , String rec)
{
this.es.sendMail(msg,rec);
}

}