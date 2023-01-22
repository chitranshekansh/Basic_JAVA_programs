import java.util.Scanner;
class centimeter
{
public static void main(String args[ ])
{
double n,inch,feet;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Value in cms to convert it into feets and inches: ");
n=sc.nextDouble();
inch=n/2.54;
feet=inch/12;
System.out.println("Value in inches: "+inch);
System.out.println("Value in feets : "+feet);
}
}
