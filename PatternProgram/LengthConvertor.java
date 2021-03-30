class LengthConvertor
{
	public void inCentimeter(float meter)
	{
		float centmeter=meter*100;
		
		System.out.println(meter+" mtr:--->"+centmeter+" cms");
	}

	public void inMeter(float centimeter)
	{
	
		float meter=centimeter/100;
		
		System.out.println(centimeter+" cms:--->"+meter+" mtr");
	}

	
	public void inKilometer(float meter)
	{
	
		float kilometer=meter/1000;
		
		System.out.println(meter+" mtr:--->"+kilometer+" km");
	}
	
	public void inInch(float foot)
	{
		if(foot<=0)
		{
		System.out.println("This value does not exist");
		}
		else
		{
		float inch=foot*12;
		
		System.out.println(foot+" ft:--->"+inch+" inches");
		}
	}
	
		
public static void main(String args[])
{
	LengthConvertor l=new LengthConvertor();
	
	l.inCentimeter(10f);
	l.inMeter(100f);
	l.inKilometer(1f);
	l.inInch(-2f);

}
}