
public class LazyInstance {

    private static LazyInstance instance;
    
    private LazyInstance()
    {
	System.out.println(instance);
    }
    
    public static LazyInstance getInstance()
	{
        
	if(instance == null)
	{
            		instance = new LazyInstance();
        	}

        return instance;
    }
	public void printHello()
	{
	System.out.println("Hello");
	}

	public static void main(String args[])
	{
		instance=null;
	}

}