import java.util.ArrayList;
class ArrayListInt
{
public static void main(String args[])
{
ArrayList <Integer> name=new ArrayList<Integer>(10);

name.add(10);
name.add(20);
name.add(30);
name.add(40);
name.add(50);
name.add(60);
name.add(70);
name.add(80);
name.add(90);
name.add(100);

for(int a:name)
{
System.out.println(a);
}

}
}