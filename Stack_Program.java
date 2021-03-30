class Stack_Program
{
int[] stack=new int[4];
int i=0; 
public void push(int data)
{
stack[i]=data;
System.out.println(i+""+stack[i]);
i++;
}
public int show()
{
int data=stack[i];
i--;
return data;
}

public static void main(String args[])
{
Stack_Program obj=new Stack_Program();
obj.push(10);
obj.push(11);
obj.push(3);
obj.push(20);

int b=obj.show();
System.out.println(b);

}
}