
public class Stack_Program {
   
	private int maxSize;
	private long[] stackArray;
	private int top;
   
   public Stack_Program(int s) {
      
	  maxSize = s;
      stackArray = new long[maxSize];
      top = -1;
   }
   public void push(long j) {
	   
	   stackArray[++top] = j;
   }
   
   public long pop() {
      
	   return stackArray[top--];
   }
   public long peek() {
      
	   return stackArray[top];
   }
   public boolean isEmpty() {
	   
	   return (top == -1);
   }
   public boolean isFull() {
      
	   return (top == maxSize - 1);
   }
   public static void main(String[] args) {
      
	   Stack_Program theStack = new Stack_Program(10);
	   
      
      theStack.push(10);
      theStack.push(10);
      theStack.push(10);
     
      
      
      while (!theStack.isEmpty()) {
         
    	  long value = theStack.pop();
       
         System.out.print(value);
         System.out.print(" ");
      }
     
   }
}