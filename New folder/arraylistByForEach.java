import java.util.ArrayList;
class arraylistByForEach

{
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();

		al.add("mahesh");
		al.add("dipak");
		al.add("yogesh");
		al.add("aakash");
		al.add("shrinivas");
		al.add("pawan");
		al.add("mahesh");

	System.out.println(al);

	al.forEach(n -> System.out.print(n+" "));	

			
	}
}