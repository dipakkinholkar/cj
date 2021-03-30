class StudDetail
{
int id;
String s_name;
public void Detail(int id, String s_name)
{
this.id=id;
this.s_name=s_name;
System.out.println("Stud_Id"+id+"Stud_Name"+s_name);
}
}
class StudClass extends StudDetail
{
public void Studclass(String stud_class)
{
System.out.println("Stud_Id"+id+"Stud_Name"+s_name+"Stud_Class"+stud_class);
}

public static void main(String args[])
{
StudClass s=new StudClass();
s.Detail(101,"dipak");
s.Studclass("msc");

}
}