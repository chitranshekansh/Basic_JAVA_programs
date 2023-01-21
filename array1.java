class array1
{
public static void main(String args[])
{
int i,temp;
int A[]={7,5,3,4,2,1,8,9,6,11};
System.out.println("Value before arranging:");
for(i=0;i<10;i++)
{
System.out.println(A[i]);
}
for(i=0;i<9;i++)
{
for(int j=i+1;j<10;j++)
{
if(A[i]>A[j])
{
temp=A[i];
A[i]=A[j];
A[j]=temp;
}
}
}
System.out.println("Value after arranging");
for(i=0;i<10;i++)
{
System.out.println(A[i]);
}
}
}