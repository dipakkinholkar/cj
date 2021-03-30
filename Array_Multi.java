import java.util.Scanner;
class Array_Multi
{


public static void main(String args[])
{
int i,j;
int[][] array=new int[2][2];
Scanner obj=new Scanner(System.in);
for(i=0; i<2; i++)
{
for(j=0; j<2; j++)
{
System.out.print("enter value for :");
array[i][j]=obj.nextInt();
System.out.println(array[i][j]);
} 
}
System.out.println("printing value");
for(i=0; i<2; i++)
{
for(j=0; j<2; j++)
{

System.out.println(array[i][j]*array[i][j]);
} 
}
}
}