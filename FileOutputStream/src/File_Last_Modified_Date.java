import java.io.File;
import java.text.SimpleDateFormat;
public class File_Last_Modified_Date
{
    public static void main(String[] args)
    {	
        //Specify the file path and name
	
    	File file = new File("F:\\Dipak.txt");
        
    	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	
    	System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
    }
}