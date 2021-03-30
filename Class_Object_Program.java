

public class Class_Object_Program {
    
    
    int Print()
    {
    int a=11;
    return a;
    }
    public static void main(String[] args)
    {
    int a=10;
        System.out.print("local :"+a);
        
        Class_Object_Program obj=new Class_Object_Program();
        
        int b=obj.Print();
        System.out.println("In_Class_Variable :"+b);
    
    }
    
    
}
