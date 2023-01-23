import java.util.Scanner;
class Bonus
{
public static void main(String args[ ])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Employee code");
System.out.println("Your choices are: 100 200 300 400");
n=sc.nextInt();
switch(n)
{
case 100:
{
System.out.println("Employee Bonus is 5%");
break;
}
case 200:
{
System.out.println("Employee Bonus is 1%");
break;
}
case 300:
{
System.out.println("Employee Bonus is 2%");
break;
}
case 400:
{
System.out.println("Employee Bonus is 25%");
break;
}
default: 
 System.out.println("Wrong Employee Code");
}
}
}