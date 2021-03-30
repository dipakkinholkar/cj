class Sample
{
public static void main(String args[])
{
Ref_Overload ro=new Ref_Overload();
ro.m1(new Ref_Overload());
ro.m1(new Sample());
ro.m1("abc");
//ro.m1(null); Ambiguous error

}
}