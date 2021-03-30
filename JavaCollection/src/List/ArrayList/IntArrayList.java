package List.ArrayList;

import java.util.ArrayList;
import java.util.List;
public class IntArrayList {

	public static void main(String[] args) {
		
		List <Integer> i=new ArrayList<Integer>()
		{
			{
			add(10);
			add(20);
			add(30);
			add(50);
			}
			
		};
		
		System.out.print(i);
		
	}

}
