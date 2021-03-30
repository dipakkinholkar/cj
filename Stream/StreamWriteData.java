import java.io.FileInputStream;
import java.io.FileOutputStream;

class StreamWriteData
{

	void Display() throws Exception
	{
		FileInputStream fi=null;
	
	fi=new FileInputStream("C:\\Users\\dipak\\Desktop\\Stream\\read.txt");
	
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

	fo=new FileOutputStream("C:\\Users\\dipak\\Desktop\\Stream\\read.txt",true);
	
	String s="today is monday";
	
	fo.write(s.getBytes());
	fo.close();
	System.out.println("Completed");		
	}
	
	public static void main(String args[]) throws Exception
	{
	  StreamWriteData ss=new StreamWriteData();
		
		ss.show();
	}
}