package latebindingOnRequirement;

public class addFunction {

	public static void main(String[] args) {
		
		LateBindingClass l=LateBindingClass.getLateBindingClass();
		
		System.out.print(l.hashCode());
		int add=l.addFunction(10,200);
		
		System.out.print("\nadd :"+add);
		
		
		
	}

}
