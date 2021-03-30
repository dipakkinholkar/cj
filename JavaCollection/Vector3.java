import java.util.Vector;

class Vector3

{
	public static void main(String args[])
	{
		
	Vector v=new Vector(12,5);
	
	
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(50);
	v.add(60);
	v.add(80);
	v.add(30);
	v.add(50);
	v.add(60);
	v.add(80);
	System.out.println(v);	
	
	System.out.println(v.capacity());		
	v.add(10);
	System.out.println(v);
	System.out.println(v.capacity());

	
	}
}
