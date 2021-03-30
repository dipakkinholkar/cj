abstract class Animal
{
public abstract void sound();
}

class Dog extends Animal
{
public void sound()
{
System.out.println("Dog");
}
}

public class Cat extends Animal
{

public void sound()
{
System.out.println("Cat");
}

public static void main(String []args)
{
Cat c1=new Cat();
c1.sound();
Dog d1=new Dog();
d1.sound();
}
}