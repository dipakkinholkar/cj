class Singleton 
{ 
	
	private static Singleton si=null;	

	
	public String s; 


	private Singleton() 
	{ 
		s = "Hello SingletonClass"; 
	} 

	public static Singleton getInstance() 
	{ 
		if (si == null) 
			si = new Singleton(); 

		return si; 
	} 
} 

class MainClass
{ 
	public static void main(String args[]) 
	{ 
		Singleton x = Singleton.getInstance(); 

		Singleton y = Singleton.getInstance(); 

		Singleton z = Singleton.getInstance(); 

		x.s = (x.s).toUpperCase(); 

		System.out.println("String from x is " + x.s); 
		System.out.println("String from y is " + y.s); 
		System.out.println("String from z is " + z.s); 
		
	System.out.println("\n"); 

		z.s = (z.s).toLowerCase(); 

		System.out.println("String from x is " + x.s); 
		System.out.println("String from y is " + y.s); 
		System.out.println("String from z is " + z.s); 
	} 
} 
