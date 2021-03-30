import java.io.FileWriter;  
public class FileWriterExample {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\testout.txt");    
		int i=1;
	    while(i>0)
	   {
           fw.write("hello dipak");
	   i++;    
	   if(i==100000)
	   {break;}
           }  



		fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     }    
}  