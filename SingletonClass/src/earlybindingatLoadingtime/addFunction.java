package earlybindingatLoadingtime;

public class addFunction {

	public static void main(String[] args) {
		
		EarlyBindingClass e=EarlyBindingClass.getEarlyBindingClass();
		
		System.out.print(e.hashCode());
		
		int add=e.add(10,30);
		
		
		System.out.print("\nadd :"+add);
		
		
	}

}
