
public class LazyInstance {

    private static LazyInstance instance;
    
    private LazyInstance()
    {
	
    }
    
    public static LazyInstance getInstance()
	{
        
	if(instance == null)
	{
            		instance = new LazyInstance();
        	}
        return instance;
    }
	public static void main(String args[])
	{
		
	}

}