Class Sort
{
public static void main(String args[])
{
int[] arr={1,4,3,2,5,6,9,7};
int i,j,temp;
 
for(i=0; i<=arr.length; i++)
{

if(arr[i]<arr[i+1])
{
temp=arr[i];
arr[i+1]=arr[i];
arr[i+1]=temp;
}
else
{
return arr;
}


}
}
}