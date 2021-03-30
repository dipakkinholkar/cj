class Animal
{
  String name;
  String color;

}

class Monkey extends Animal
{

} 

class Dog extends Animal
{


}

class TestAnimal
{
	public void m1(Animal a)
	{
	System.out.println("Animal-version");
	}

	public void m1(Monkey m)
	{
		System.out.println("Monkey-version");
		
	}

public static void main(String args[])
{
	TestAnimal t=new TestAnimal();
	
	Animal a=new Animal();
		
	t.m1(a);
	
	Monkey m=new Monkey();
	
	t.m1(m);
	
	Animal a1=new Monkey();
	
	t.m1(a1);

}
}