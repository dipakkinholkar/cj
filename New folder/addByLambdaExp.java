interface Add
{
	void sum(int x, int y);
}
class addByLambdaExp
{
public static void main(String args[])
{
	Add d=(int a, int b)->System.out.print(a+b);

	d.sum(10,20);

}




}