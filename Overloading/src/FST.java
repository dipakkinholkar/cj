
public class FST {

	public static void main(String args[])
	{
		
		Second s=new Second();
		
		s.m1(50);
		s.m1('a');
		s.m1(20L);
		
		System.out.println();
		First f=new First();
		f.m1(50);
		f.m1('a');
		//f.m1(100l);// error
		
	}
}
