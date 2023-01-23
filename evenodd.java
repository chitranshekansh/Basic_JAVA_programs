
import java.util.Scanner;
class Evenodd{
public static void main(String args[ ])
{
int n;
Scanner input= new Scanner(System.in);

System.out.println("Enter Number to Check Even Odd:");
n=input.nextInt();
if(n%2==0)
{
System.out.println("Even Number");
}
else
{
System.out.println("Odd Number");
}
}
}