class Shape
{
int w,h,d;
Shape()
{
w=5;
h=7;
d=3;
}
Shape(int x,int y,int z)
{
w=x;
h=y;
d=z;
}
Shape(Shape obj)
{
w=obj.w;
h=obj.h;
d=obj.d;
}
void area()
{
int ar=2*(w*h+h*d+d*w);
System.out.println("Area of Shape:"+ar);
}
public static void main(String ar[])
{
Shape S1=new Shape();
Shape S2=new Shape(2,8,4);
Shape S3=new Shape(S1);
S1.area();
S2.area();
S3.area();
}
}


 