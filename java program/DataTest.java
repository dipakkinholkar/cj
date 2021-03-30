class Data
{
	private String name;

	public void setName(String name )
	{
	this.name=name;
	}
	
	public String getName()
	{
	return name;
	}	
	

}
class DataTest
{
	public static void main(String args[])
	{
	Data d=new Data();
	d.setName("dipak");
	System.out.println(d.getName());
	}
}