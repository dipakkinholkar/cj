class Array_Sort
{
public static void main(String args[])
{
int[] stack={10,30,20,40,5};
int i,temp,j;

for(i=0; i<stack.length; i++)
{
System.out.println(stack[i]);
}

for(i=0; i<stack.length; i++)
{
for(j=i+1; j<stack.length; j++)
{
if(stack[i]>stack[j])
{
temp=stack[i];
stack[i]=stack[j];
stack[j]=temp;
}
}
}
System.out.println("Sorting");
for(i=0; i<stack.length; i++)
{
System.out.println(stack[i]);
}
}
}