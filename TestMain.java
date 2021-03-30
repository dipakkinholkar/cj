class Feeling
{
 void good()
	{
 	}
void bad(){}
 }
class M extends Feeling
{
void good()
{
System.out.println("M:good");
}
void bad()
 {
 System.out.println("M:Bad");
 }
}

class F extends Feeling
{
void good()
{
System.out.println("F:good");
}
void bad()
 {
 System.out.println("F:Bad");
 }

}

class Main
{
static void Feel(Feeling f)
{
f.good();
f.bad();
}
}

class TestMain extends Main
{
public static void main(String args[])
{
Main.Feel(new M());
Main.Feel(new F());

}

}



