class EnhanceForLoop
{
public static void main(String arg[])
{
int[][] a={
	{10,20,30},
	{40,50,60},
	{70,80,90},
	};

for(int k[] : a)
{
int i=0;
 for(int c : k)
{
System.out.print(c);
System.out.print(k[i]);
i++;
System.out.println(" Other method");

}
System.out.println(" ");
}


}
}