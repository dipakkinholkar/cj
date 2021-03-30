package List.ArrayList;

import java.util.ArrayList;
import java.util.List;
public class ArrayListMethod {

	public static void main(String[] args) {

		List<String> al=new ArrayList<String>();
		
		al.add("hello");
		
		System.out.print(al.get(0));
		al.set(0, "dipak");
		al.remove(1);
		al.clear();
		al.size();
	
	
	}

}
