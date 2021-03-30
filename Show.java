interface add
{
public void sum(int a, int b);
}

class Task<Integer,Integer>
{
public static void sum(int a , int b)
{
return a+b;
}

}

class Show 
{
	public static void main(String args[])
	{
		add<Integer,Integer> a=Task::sum();
			
		System.out.println(a);
		}
}