import java.io.*;
class MatrixMulti
{
public static void main(String args[])
{
int[] a={20,30,40,};
		System.out.println(a[0]==a[0]);  // true 

		System.out.println(a[0]=a[1]);   // 30 asigning the a[1] value to a[0].

		System.out.println(a[0]);	 // 30  checked the value of a[0] i.e 30.

		System.out.println(a[1]);        // 30  actual array initialization value.

		System.out.println(a[2]);        // 40  actual array initialization value.
		
		System.out.println(a[2]-a[2]);   // 0 -- 40-40=0. 
		
		System.out.println(a[0*1]-a[2]); // -10 --- 20-30=-10
	
		System.out.println(a[10-8]-a[2]);   // 0 --- a[2]-a[2]
		
		System.out.println(a[-2]-a[2]);     // error : java.lang.ArrayIndexOutOfBoundsException

		System.out.println(a[-2]-a[2]);     // 0 : ++(0),+-(0),--(0),-+(0)
		
		System.out.println(a[10]-a[10]);    //
		
		// System.out.println(a[-2]-a[2]);
			
		// System.out.println(a[-2]-a[2]);


































}
}