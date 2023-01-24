import java.util.Scanner;
class Employee
{
String Fname,Lname;
double Salary,Ysalary;
void getinput()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter First Name,Last Name and Monthly Salary :");
Fname=sc.nextLine();
Lname=sc.nextLine();
Salary=sc.nextDouble();
}
void Employeetest()
{
System.out.println("Employee Name :\t"+Fname+" "+Lname);
Ysalary=12*Salary;
System.out.println("Salary before raise :\t"+Salary);
Ysalary=Ysalary+10/100;
System.out.println("Employee Name :\t"+Fname+" "+Lname);
System.out.println("Salary after raise :\t"+Ysalary);
}
public static void main(String args[])
{
Employee emp1=new Employee();
Employee emp2=new Employee();
emp1.getinput();
emp2.getinput();
emp1.Employeetest();
emp2.Employeetest();
}
}