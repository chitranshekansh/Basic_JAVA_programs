class University
{
String uname;
University()
{
uname="University of IT";
System.out.println("University Name");
}
void showuniversity()
{
System.out.println(uname);
}
}
class College extends University
{
String cname;
College()
{
cname="Sherwood College";
System.out.println("College Name");
}
void showcollege()
{
System.out.println(cname);
}
}
class Address extends College 
{
String adres;
Address()
{
adres="Indira Nagar Sector 17";
System.out.println("Address");
}
void showaddress()
{
System.out.println(adres);
}
}
class Student extends Address 
{
String sname;
Student()
{
sname="Ekansh Arun Srivastava";
System.out.println("Student Name");
}
void showstudent()
{
System.out.println(sname);
}
}
class Inheritance
{
public static void main(String args[])
{
Student st=new Student();
st.showuniversity();
st.showcollege();
st.showaddress();
st.showstudent();
}
}