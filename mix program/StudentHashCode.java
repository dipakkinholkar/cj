class StudentHashCode
{
public static void main(String args[])
{
private int sno;
private String sname;
private String course;

public StudentHashCode(int sno , String sname, String course)
{
this.sno=sno;
this.sname=sname;
this.course=course;
}
@Override
public int hashCode()
{
return sno;
}
}
StudentHashCode s1=new StudentHashCode(101,"dipak","java");

System.sout.println(s1.hashCode());
}