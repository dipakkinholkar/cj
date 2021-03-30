class SamsungLaptop extends Laptop implements Samsung
{
	public void Type()
	{
		System.out.println("Company Name: "+com_name);
	}

	public void Battary()
	{
		System.out.println("Battary : Long Life Battary");
	}
	public void Camera()
	{
		System.out.println("Camera : 2 MB Camera Available");
	}
	
	public void Ram()
	{
		System.out.println("Ram : 8GB Ram Available " );
	}
	
	public void HardDisk()
	{
		System.out.println("HarDisk : 1000GB HardDisk Available");
	}
	
}