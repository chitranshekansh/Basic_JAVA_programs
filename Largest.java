import java.util.Scanner;
class Largest
{
public static void main(String args[ ])
{
int a,b,c,n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter three integers number:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
n=(a > b) ? ( a > c ? a : c):( b > c ? b : c);
System.out.println("Largest number is:"+n);
}
}