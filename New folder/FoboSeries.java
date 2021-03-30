class FoboSeries
{

	static int f=0, s=1,temp=0;

	public static void F(int no)
	{
	if(no>0)
	{
	temp=f+s;
	System.out.print(","+temp);
	f=s;
	s=temp;
	F(no-1);
	}
	}

	public static void main(String args[])
	{
	int no=10;
	FoboSeries fb=new FoboSeries();
	System.out.print(fb.f+","+fb.s);
	fb.F(no-2);
	}

}