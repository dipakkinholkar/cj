		/* Base class vehicle */
class Vehicle 
{ 
	int maxSpeed = 120; 
  public int lowSpeed=10;
	
	
	
} 

/* sub class Car extending vehicle */
class Car  extends Vehicle
{ 
	int maxSpeed = 180; 
	int lowSpeed=0;
	
	void display() 
	{ 
		/* print maxSpeed of base class (vehicle) */
		System.out.println("Maximum Speed: " + super.maxSpeed); 
		System.out.println("minimum Speed: " +lowSpeed); 
		System.out.println("minimum Speed: " +super.lowSpeed); 
		super.lowSpeed=20;
		System.out.println(super.lowSpeed);
		this.lowSpeed=30;
		System.out.println(this.lowSpeed);
		lowSpeed=40;
		System.out.println(lowSpeed);
		
	} 
	
} 

/* Driver program to test */
class Test 
{ 
	public static void main(String[] args) 
	{ 
		Car small = new Car(); 
		small.display(); 
		
		
	} 
} 

