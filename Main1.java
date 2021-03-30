class Complex { 
	 double re, im;		 

	public Complex(double re, double im) { 
		this.re = re; 
		this.im = im; 
	} 
} 

// Driver class to test the Complex class 
public class Main1 { 
	public static void main(String[] args) { 
		Complex c1 = new Complex(10, 15); 
		System.out.println(c1.re);
		System.out.println(c1.im);
		System.out.println(c1); 
	} 
} 
