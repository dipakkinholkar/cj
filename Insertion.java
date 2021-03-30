class Insertion
{
void MethodOne()
{
int[] arr={10,20,30,40,50,60,70,80};

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);
System.out.println(arr[5]);
System.out.println(arr[6]);
System.out.println(arr[7]);
}

void MethodTwo()
{
int[] arr={10,20,30,40,50,60,70,80};

System.out.print("Using For Loop\n");

for(int i=0; i<=arr.length; i++)
{
System.out.println(arr[i]);
}
}
public static void main(String args[])
{
Insertion m1=new Insertion();
Insertion m2=new Insertion();
m1.MethodOne(); 
m2.MethodTwo();
}
}