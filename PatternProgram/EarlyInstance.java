class EarlyInstance{  


 private static EarlyInstance obj=new EarlyInstance(); 

		 private EarlyInstance()
		{
			System.out.println("Constructor Created");
		}  
   
		 public static EarlyInstance getEarlyInstance()
		{  
			  return obj;  
		}  
  
 		public void doSomething()
		{  
			System.out.println("hello");
		}  

		public static void main(String args[])
		{
			obj.doSomething();
			
		}

}  