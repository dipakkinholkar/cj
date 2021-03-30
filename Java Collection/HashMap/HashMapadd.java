import java.util.HashMap;
import java.util.Scanner;
class HashMapadd
{
	public static void main(String []args)
	{
	HashMap<String,String> cap=new HashMap<String,String>();
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter Country Name :");
	String country=scn.next();
	cap.put("India","New Delhi");
	cap.put("America","Washington, D.C.");
	cap.put("China","Beijing");
	cap.put("Pakistan","Islamabad");		
	cap.put("Egypt","Cairo");
	cap.put("Finland","Helsinki");
	cap.put("Germany","Berlin");
	cap.put("Indonesia","Jakarta");
	cap.put("Itary","Rome");
	cap.put("Japan","Tokyo");
	cap.put("Vietnam","Hanoi");				
	cap.put("Switzerland","Bern");
	cap.put("South Korea","Seoul");
	cap.put("Russia","Mascow");
	cap.put("North Korea","Pyongyang");
	cap.put("Brazil","Brasilia");
	
		
	System.out.print(cap.get(country));
	}
}