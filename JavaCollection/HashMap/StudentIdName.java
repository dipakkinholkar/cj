import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
class StudentIdName
{
	public static void main(String []args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.print("Enter Student Id :");
	int sid=scn.nextInt();

	HashMap<Integer,String> h=new HashMap<>();
			

	h.put(101,"dipak kadam");
	h.put(102,"mahesh kulkarni");
	h.put(103,"D Bhosale");
	h.put(104,"Pawan Bansode");
	h.put(105,"Anurag Pedgaonkar");
	h.put(106,"Yogesh Agnihotri");
	h.put(107,"Vish Dange");
	h.put(108,"Akash Giram");
	h.put(108,"Akash Patil");

	System.out.println(h.containsValue("dipak kadam"));
	
	System.out.println(h.get(sid));
	System.out.println(h.size());
	

	System.out.println(h.containsKey(sid));
	System.out.print(h.isEmpty());
	h.replace(108,"Akash Giram");
	System.out.println(h.get(108));
	h.clear();
	System.out.println(h);
	
	}
}