class Thread_Sleep_Time extends Thread{  
 public void run(){  
  
Date obj=new Date();

for(int i=1;i<5;i++){  
    
	try{
		Thread.sleep(500);
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}  
	
	System.out.println(obj);  
	}  
 
}  
 public static void main(String args[]){  
  Thread_Sleep_Time t1=new Thread_Sleep_Time();  
   
  t1.start();  
  }  
}