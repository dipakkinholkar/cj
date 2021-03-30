import java.io.FileInputStream;
import java.io.FileOutputStream;

class CopyImage
{

	void Display() throws Exception
	{
		FileInputStream fi=null;
	
	fi=new FileInputStream("C:\\Users\\dipak\\Desktop\\Stream\\image.jpg");
	
	int i;
	
	while((i=fi.read()) !=-1)
	{
		System.out.println(i);
	}
	fi.close();
	}
		
	void show() throws Exception
	{
	
	System.out.print("File Writting Started");	
	
	FileOutputStream fo=null;

	fo=new FileOutputStream("C:\\Users\\dipak\\Desktop\\Stream\\read1.jpg",true);
	
	String s="today is monday";
	
	fo.write(s.getBytes());
	fo.close();
	System.out.println("Completed");		
	}
	
	public static void main(String args[]) throws Exception
	{
	  CopyImage ss=new CopyImage();
		
		ss.show();
	}
}