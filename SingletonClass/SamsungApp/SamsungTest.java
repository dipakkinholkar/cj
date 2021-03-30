class SamsungTest
{
	public static void main(String args[])
	{
		SimpleSamsung sim=new SimpleSamsung();	
		
		System.out.println("______________________________________");
		sim.Type();
		sim.MobileType();	
		sim.Battary();
		sim.Camera();
		System.out.println("______________________________________");
		SmartMobile smm=new SmartMobile();
		smm.Type();
		smm.MobileType();
		smm.Battary();	
		smm.Camera();
		System.out.println("______________________________________");
		SamsungLaptop sl=new SamsungLaptop();
		sl.Type();
		sl.Battary();
		sl.Ram();
		sl.HardDisk();
		sl.Camera();
	}
}