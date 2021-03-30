
import java.util.*;
class StackDemo
{
public static void main(String args[])
{
Stack s=new Stack();


s.push("hello");
s.push("dipak");
s.push("maroti");
s.push("kadam");
s.push(null);
s.push(101);
System.out.println(s);
s.pop();
System.out.println(s);
s.pop();
System.out.println(s);
s.peek();
System.out.println(s);
}
}