interface V
{
	void showValue(int a);
	}
interface J
{
	void show();
}

class TestExpression1

{
	public static void main(String args[])
	{
	V v=(int x) -> System.out.println(x*2);
	v.showValue(5);		
	J j=() ->System.out.print("hello");
	j.show();
	
	}
}