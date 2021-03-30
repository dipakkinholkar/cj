package Accurate_Program;
public class Stack_Push_Data {

	public static void main(String[] args) {
		
		
		Stack_Push obj=new Stack_Push();
		
		obj.push(10);
		obj.push(20);
		obj.push(50);
		obj.push(40);
		obj.push(60);
		System.out.println("last inserted value:"+obj.peek());
		obj.push(70);
		System.out.println("last deleted value:"+obj.pop());
		obj.show();
		
	}

}
