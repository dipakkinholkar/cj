enum Days
{

	SUN,MON,TUE,WED,THU,FRI,SAT;
	public static void main(String args[])
	{
		
	Days[] d=Days.values();
		
	for(Days i : d)
	{
		System.out.println(i+"-----"+i.ordinal());

	}
	System.out.println(ordinal(0));
	

	}
}