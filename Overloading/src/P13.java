class P13 {

	public static void main(String[] args) {

		P12 p12=new  P12();
		p12.m1(50);
		p12.m1('a');
		p12.m1(50L);
		
		System.out.println("");
		
		P11 p11=new P11();
		
		p11.m1(50);
		p11.m1('a');
		//p11.m1(50l); error
		
		p12.m1("dipak");

	}

}
