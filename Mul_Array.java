class Mul_Array
{
public static void main(String args[])
{

int[][] s=new int[3][];

s[0]=new int[3];

s[1]=new int[4];

s[2]=new int[3];

for(int i=0; i<s.length; i++)
{
for(int j=0; j<s.length; j++)
{
s[i][j]=i+j;
System.out.println(s[i][j]+"");
}
}
}
}