

public class Fuction_Return_Value {

    int return_value(int b)
    {
    int a;
        a=b;
        return a;
    
    }
    int Again_return_value(int e)
    {
    int f=e;
    
    return f;
    }
   
    
    
    
    
    
    
    public static void main(String args[])
    
    {
        Fuction_Return_Value f=new Fuction_Return_Value();
        int c=10;  //
        int d=f.return_value(c);  //    c----->return_value(int b) ---> a=b; -->return a--->f.return_value--->d=f.return_value();
        d++;
        System.out.println("d :"+d);  //d=10.
        //---------------------------------------------------------------
        d=f.return_value(d); //  d=11.
        System.out.println("d:"+d); // d=11.
        
        //---------------------------------------------------------------
       int e=d;
       int ff=f.Again_return_value(e);//11
       ff++; // ff=11+1;
       System.out.println("ff :"+ff); //12
       //----------------------------------------------------------------
    
    }
    
    
}
