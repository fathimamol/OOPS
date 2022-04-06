import java.util.*;
public class fibonacciwhile
{
public static void main(String args[])
{
int i=0,max=10,prev=0,next=1;
System.out.print("Fibonacci series of"+max+"numbers:");
while(i<=max)
{
System.out.print(prev+" ");
int sum=prev+next;
prev=next;
next=sum;
i++;
}
}
}