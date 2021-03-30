interface MethodList
{
public abstract void move();
public void left();
public void right();
public void up();
public void down();
}

class MethodImp implements MethodList
{

public void move()
{
System.out.println("Moving");
}
public void left()
{
System.out.println("Move left");
}

public void right()
{
System.out.println("Move right");
}

public void down()
{
System.out.println("Move down");
}

public void up()
{
System.out.println("Move up");
}

public static void main(String args[])
{
MethodImp m1=new MethodImp();
m1.move();
m1.left();
m1.right();
m1.up();
m1.down();
}

}