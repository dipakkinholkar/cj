import java.util.Scanner;
class DeleteChar
{
public DeleteChar(char del[],char rem)
{
System.out.println(del);

for(int i=0; i<del.length; i++)
{
if(del[i]==rem)
{
del[i]=0;
}
else
System.out.println("char not found");
}
System.out.println(del);
}
}
class DeleteCharTest
{
public static void main(String args[])
{
Scanner scn=new Scanner(System.in);
char rm=scn.nextCharacter();
char arr[]={'a','b','c','d'};
DeleteChar del=new DeleteChar(arr,rm);
}
}