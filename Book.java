//Program to take input using Data Input Stream Reader 
import java.io.*;
class Book
{
public static void main(String args[ ])throws IOException
{
String book_name;
int pages;
float CP,SP;
DataInputStream d=new DataInputStream(System.in);
System.out.println("Enter Book Name,Pages,Cost Price and Selling Price");
book_name=d.readLine();
pages=Integer.parseInt(d.readLine());
CP=Float.parseFloat(d.readLine());
SP=Float.parseFloat(d.readLine());
System.out.println("Book Name\t"+book_name);
System.out.println("Pages\t\t"+pages);
System.out.println("Cost Price\t"+CP);
System.out.println("Selling Price\t"+SP);
if(SP>CP)
System.out.println("Profit\t\t"+(SP-CP));
else if(CP>SP)
System.out.println("Loss\t\t"+(CP-SP));
else
System.out.println("No Profit nor Loss");
}
}
