class CreateO implements CreateObject
{
	public CreateO()
	{
	System.out.println("Con");
	}
	
	public CreateObject getObj()
	{
	return new CreateO();
	}
}