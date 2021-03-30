import java.util.LinkedList;
class LinkedList1
{
	public static void main(String args[])
	{
		LinkedList ls=new LinkedList();	
		ls.add(10);
		ls.add(20);
		ls.add(30);	
		ls.add(10);
		ls.add("hello");
		System.out.println(ls);	
		System.out.println(ls.size());		
		System.out.println(ls.indexOf(10));	
		
		LinkedList ls1=new LinkedList();	
		
		ls1.addAll(0,ls);
		System.out.println(ls1);
		
		System.out.println(ls.size()==ls1.size());

		ls1.add("dipak");
		System.out.println(ls1);
		ls1.add("dipak");
		System.out.println(ls1);
		ls1.addFirst("First");	
		System.out.println(ls1);
		ls1.addLast("Last");
		System.out.println(ls1);
		ls1.remove("dipak");
		System.out.println(ls1);
		ls.removeAll(ls1);
		System.out.println(ls);
		ls1.removeFirst();
		ls1.removeLast();
		System.out.println(ls1);
		ls1.removeFirstOccurrence("dipak");
		System.out.println(ls1);		
		ls1.removeLastOccurrence("hello");
		System.out.println(ls1);
		ls1.clear();
		System.out.println(ls1);		
		
			
}

}