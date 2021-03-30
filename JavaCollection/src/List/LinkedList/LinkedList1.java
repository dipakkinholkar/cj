package List.LinkedList;

import java.util.LinkedList;
public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList ls=new LinkedList();
		int[]  collection={10,320,40,50,40};
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.addFirst(100);
		ls.addLast(200);
		ls.add(0,"dipak");
		ls.removeFirst();
		ls.removeLast();
		ls.clear();
		ls.add(collection);
		
		for(int i=0; i<collection.length; i++)
		{
		System.out.print(collection[i]+",");
		}
	}

}
