import java.util.*;
public class swapwithout
{
public static void main(String args[])
{
Scanner in= new Scanner(System.in);
System.out.println("enter the number for A:");
int x=in.nextInt();
System.out.println("enter the number for B:");
int y=in.nextInt();
System.out.println("Before swapping numbers in A and B are:"+x+" "+y);
x=x+y;
y=x-y;
x=x-y;
System.out.println("After swapping numbers in A and B are:"+x+" "+y);
}
}
