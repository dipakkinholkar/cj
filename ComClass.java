class ComClass
{
	interface vehicle
	{
	public int NoOfVehicle();
	}

	class Bus implements vehicle
	{
		public int NoOfVehicle()
		{
		return 7;
		}
	}
	class Car implements vehicle
	{
		
		public int NoOfVehicle()
		{
		return 10;
		}	
	}
	class Tractor implements vehicle
	{
	
		public int NoOfVehicle()
		{
		return 15;
		}	
	
	}	

public static void main(String args[])
	
	{
	ComClass cm=new ComClass();
	
	ComClass.Bus b=cm.new Bus();
	int z=b.NoOfVehicle();
	ComClass.Car c=cm.new Car();
	int x=c.NoOfVehicle();
	ComClass.Tractor t=cm.new Tractor();
	int y=t.NoOfVehicle();
	System.out.print(z);
	System.out.print(x);
	System.out.print(y);

	}


}