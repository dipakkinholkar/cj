class Outer17
{
	
	class Inner17
	{
	String name;
		
	double sal;
	
	int num;
	
	}
public static void main(String args[])
	{
	Outer17 obj=new Outer17();
	Outer17.Inner17 i=obj.new Inner17();
	
	i.name="hello";
	
	i.sal=10000;
		
	i.num=1010;

		System.out.println(i.name);
		System.out.println(i.sal);
		System.out.println(i.num);

	}
}
