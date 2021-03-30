		class <E>
	{
		Object obj;
		
		Object(E obj)
		{

		this.obj=obj;
		}

		public E getObject()
		{
		return this.obj;
		}
		
	}


class GenericClass
{
public static void main(String args[])
	{
		Name<Integer> n=new Name<Integer>(10);
		System.out.print(n.getObject());
		
		Name<String> s=new Name<String>("dipak");
		System.out.print(s.getObject());
	
	
	}


}