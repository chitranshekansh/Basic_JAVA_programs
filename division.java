import java.util.Scanner;
class division
{
public static void main(String args[ ])
{
float a,b,div;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
a=sc.nextFloat();
b=sc.nextFloat();
if(b==0)
System.out.println("Second Value Cannot be Zero");
else
{
div=a/b;
System.out.println("Divison of the given number:"+div);
}
}
}