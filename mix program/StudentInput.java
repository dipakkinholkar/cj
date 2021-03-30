class StudentInput
{
private int sno;
private String sname;
private String course;

StudentInput(int sno,String sname,String course)
{
this.sno=sno;
this.sname=sname;
this.course=course;
}
}

class TestStudentInput
{
public static void main(String args[])
{
StudentInput s1=new StudentInput(101,"DIPAK","JAVA");
StudentInput s2=new StudentInput(102,"MAHESH","WEB");

System.out.println(s1.hashCode());
System.out.println(s2.hashCode());


}
}