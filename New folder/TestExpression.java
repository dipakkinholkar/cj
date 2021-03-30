interface V
{
	void showValue(int a);	
}
interface S
{
void showString(String name);	
}

class TestExpression

{
	public static void main(String args[])
	{
	V v=(int x) ->System.out.println(x*2);

	v.showValue(5);

	S s=(String str) ->System.out.println(str);
	
	s.showString("dipak");
			
	
	}
}