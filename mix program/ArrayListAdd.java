package BasicProgram;

import java.util.ArrayList;

public class ArrayListAdd {

	public static void main(String[] args) {
		
		// creating an ArrayList
		ArrayList al=new ArrayList();
		
		
		//adding an int type element in ArrayList
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		al.add(800);
		al.add(900);
		
		// adding String type element in ArrayList
		
		al.add("parbhani");
		al.add("Latur");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Solapur");
		al.add("Aurangabad");
		al.add("Jalna");
		al.add("Nanded");
		
		
		//displaying an ArrayList Elements.
		
		System.out.println(al);
		
		al.remove(10);
		
		System.out.println(al);
		
		
	}

}
