class Str
{
	 Str(byte a)
	{
	System.out.println("byte:"+a);
	}
		
	Str(short b)
	{
	System.out.println("short:"+b);
	}
	
	Str(char c)
	{
	System.out.println("char:"+c);
	}
	
	Str(int d)
	{
	System.out.println("int:"+d);
	}
	
	Str(float e)
	{
	System.out.println("float:"+e);
	}
		
	Str(double f)
	{
	System.out.println("double:"+f);
	}
	
	Str(long g)
	{
	System.out.println("long:"+g);
	}
	
	Str(boolean h)
	{
	System.out.println("boolean:"+h);
	}


public static void main(String args[])
{
Str a=new Str((byte)10);

Str b=new Str((short)100);

Str c=new Str((int)100000);

Str d=new Str((double)100292003d);

Str e=new Str((char)'a');

Str f=new Str((float)327927f);

Str g=new Str(true);

Str h=new Str((long)10397593593l);


}
}