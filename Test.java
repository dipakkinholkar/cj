import java.util.Scanner;

class Living
{
void move()
{
System.out.println("Living Class");
}
}

class Person extends Living
{
void move()
{
System.out.println("walking...");
}
}

class Animal extends Living
{
void move()
{
System.out.println("running...");
}
}


class Bird extends Living
{
void move()
{
System.out.println("flaying...");
}
}

class Universe
{
static void Live(Living l)
{
l.move();
}
}

class Test
{
public static void main(String args[])
{
	Scanner scn=new Scanner(System.in);
System.out.print("Enter your Branch:");
String name=scn.nextLine();
switch(name)
{
case "Person":

Universe.Live(new Person());break;
case "Animal":

Universe.Live(new Animal());break;

case "Bird":

Universe.Live(new Bird());break;

default :
System.out.println("Invalid Input!");break;
}
}
} 
