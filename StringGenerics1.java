import java.util.ArrayList;
class StringGenerics1
{
	public static void main(String args[])
	{

	ArrayList al=new ArrayList();
	
	al.add("dipak");
	al.add("kadam");
	al.add("patil");
	al.add("kinhola");
	al.add("patil");
	al.add("kadam");
	al.add(new Integer(10));


	
	String[] name=new String[10];
	for(int i=0; i<name.length; i++)
	{
	System.out.print(name[i]=(String)al.get(i));
	}
	}

}
