public class Static_Variable_Static_Method_Program_Execution {

	static int a=m1();
	
	
	static int m1(){
		
		System.out.println("SV1: a");
		
		return 10;
	}
	
	static{
		System.out.println("SB1");
	}
	
	static int b=m2();
	
	static int m2()
	{
		System.out.println("SV2:b");
	
		return 20;
	}
	static void m4()
	{
		System.out.println("SM");
	}
	
	public static void main(String[] args){
	
		System.out.println("MM");
	}
		static int c=m3();

	
	static int m3()
	{
		System.out.println("SV3:C");
		
		return 30;
	}
	
	static{
		
		System.out.println ("SB2");
		
	}
		
	}


