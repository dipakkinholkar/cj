import java.util.Vector;

class Vector2

{
	public static void main(String args[])
	{
		
	Vector v=new Vector(20);
	
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
	v.add(30);
	v.add(50);
	v.add(60);
	v.add(80);

	System.out.println(v);	
	//System.out.println(v.size());
	System.out.println(v.capacity());
	

	System.out.println(v);	
	v.add(80);
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

	
	}
}
