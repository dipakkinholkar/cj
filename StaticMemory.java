class StaticMemory
{
static int b(int a){

System.out.println("static a:"+a);
return a; 
}

void c(int d)
{
System.out.println("b"+d);
}

public static void main(String args[])
{
StaticMemory obj=new StaticMemory();
int a=b(20);
obj.c(a);



}
}