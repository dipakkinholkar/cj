import java.util.ArrayList;
class ArrayList1
{
public static void main(String args[])
{
ArrayList <String> name=new ArrayList<String>(10);

name.add("A");
name.add("B");
name.add("C");
name.add("D");
name.add("E");
name.add("F");
name.add("G");
name.add("H");


for(String a:name)
{
System.out.println(a);
}

}
}