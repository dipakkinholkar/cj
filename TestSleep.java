class TestSleep extends Thread{  
int i=0;
public void run(){    
try{  
for(i=0; i<=44; i++)
{
Thread.sleep(50);
System.out.print(".");
Thread.sleep(50);
System.out.print(".");
Thread.sleep(50);
System.out.print(".");
}
}
catch(Exception e)
{
System.out.println(e);
}
}  
 public static void main(String args[]){  
  TestSleep t1=new TestSleep();
  T2 t2=new T2();    
  t1.start();
  t2.start();
  }  
}
class T2 extends Thread{
int i=0;

public void run(){    
try{  
for(i=0; i<=44; i++)
{
Thread.sleep(50);
System.out.print(".");
Thread.sleep(50);
System.out.print(".");
Thread.sleep(50);
System.out.print(".");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}

  