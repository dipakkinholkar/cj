class String_Split
{
public static void main(String args[])
{

String s1="Name:dipak:kadam";
 
String[] s2 = s1.split(":",0); 
  
        for (String a : s2) 
            System.out.print(a); 
}
}