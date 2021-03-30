class Super_This_Main extends Super_This_Class
{
public static void main(String args[])
{
int x=20;
Super_This_Main obj=new Super_This_Main();

System.out.println(x);
System.out.println(this.x);

System.out.println(super.x);
}
}