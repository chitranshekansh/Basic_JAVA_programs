import java.util.Scanner;
class Area
{
double rect,tri,length,breadth,base,height;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Length And Breadth of Rectangle:");
length=sc.nextDouble();
breadth=sc.nextDouble();
System.out.println("Enter base And height of Triangle:");
base=sc.nextDouble();
height=sc.nextDouble();
}
void arearect()
{
rect=length*breadth;
System.out.println("Area of Rectangle:"+rect);
}
void areatri()
{
tri=0.5*(base*height);
System.out.println("Area of triangle:"+tri);
}
public static void main(String args[])
{
Area obj=new Area();
obj.input();
obj.arearect();
obj.areatri();
}
}
