interface Add
	{
		public void add();
		public void sub();	
	}

class AnoInnClassLogic implements Add
	{
		public void add()
		{
			System.out.println("add-main");
		}
		
		public void sub()
		{
				System.out.println("sub-main");
				
		}
		class IC
		{
			public void m1()
				{
				System.out.println("m1");
				}
		}
		
			
		class InnerClass1 extends IC implements Add
		{
		 	public void add()
			{
				System.out.println("add");
			}
			public void sub()
			{
				System.out.println("sub");
			}
			public void m1()
			{
				super.m1();
				System.out.println("Inn-m1");
			}	
		
		}
		
	public static void main(String args[])
		{
		AnoInnClassLogic aa=new AnoInnClassLogic();	
		aa.add();
		AnoInnClassLogic.InnerClass1 ii=aa.new InnerClass1();
		ii.add();
		ii.sub();
		aa.sub();
		ii.m1();
		
		}
	}