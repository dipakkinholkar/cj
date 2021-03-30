class IntArray
{
public static void main(String args[])
{
int stud[]=new int[100];
int[] s=new int[100];

int id=101;

for(int i=0; i<99; i++)
{
stud[i]=id;
s[i]=id;
id++;
}

for(int i=0; i<99; i++)
{
System.out.println(stud[i]+":"+s[i]);
}



}
}