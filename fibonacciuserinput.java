import java.util.*;
public class fibonacciuserinput
{
public static void main(String args[])
{
int max=0,prev=0,next=1;
System.out.print("How many numbers you want in fibonacci:");
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
System.out.print("Fibonacci series of"+a+"numbers:");
for(int i=1;i<=a;i++)
{
System.out.print(prev+" ");
int sum=prev+next;
prev=next;
next=sum;
}
}
} 