//pass char array element to string
class PassCharArrayToString
{
	
	public static void main(String args[])
	{

		char[] str={'d','i','p','a','k'};
		
		for(int i=0; i<str.length; i++)
		{System.out.print(str[i]);}

		String s=new String(str);
		System.out.println(s); //dipak

				
}

}