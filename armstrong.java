import java.util.Scanner;
class armstrong
{
public static void main(String args[ ])
{
long i,n,sum,m,o,rem,count=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter range to check armstrong:");
n=sc.nextLong();
for(i=100;i<=n;i++)
{
m=i;
while(m!=0)
{
m=m/10;
++count;
}
m=i;
sum=0;
while(m!=0)
{
rem=m%10;
sum+=Math.pow(rem,count);
m=m/10;
}
if(sum==i)
{
System.out.println(i);
}
count=0;
}
}
}