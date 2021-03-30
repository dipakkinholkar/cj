
class Office extends Student

	{
		
		int total_fees;
		int paid_fees;
		int remain_fees;
		
		public void FeesDetails(int total_fees,int paid_fees,int remain_fees)
		
			{	
				
				System.out.println(id+""+name+""+sclass+""+total_fees+""+paid_fees+""+remain_fees);
		
			}		
		
		public static void main(String args[])
	
			{
				Office o=new Office();		
				o.Display(101,"dipak","M.sc");
				o.FeesDetails(10000,5000,5000);
			}				
		
			
	}



