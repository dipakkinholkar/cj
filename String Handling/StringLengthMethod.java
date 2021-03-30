class StringLengthMethod
{

public int len(String s2)
{
int i=0;
char leg[]=s2.toCharArray();
for(char c : leg)
{
i++;
}
System.out.println(i);
return i;
}
public static void main(String args[])
{
StringLengthMethod obj=new StringLengthMethod();

String s1="dipak";
obj.len(s1);
}
}