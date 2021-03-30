package com.green.bankloan;

	class LoanFactory extends AbstractFactory{  
        public Bank getBank(String bank){  
             return null;  
       }  
     
  public Loan getLoan(String loan){  
   if(loan == null){  
      return null;  
   }  
   if(loan.equalsIgnoreCase("Home")){  
      return new Home();  
   } else if(loan.equalsIgnoreCase("Business")){  
      return new Business();  
   } else if(loan.equalsIgnoreCase("Education")){  
      return new Education();  
   }  
   return null;  
}  
  
}  


