import java.util.*;
public class primerange
{
public static void main(String args[])
{
int i,count;
Scanner in= new Scanner(System.in);
System.out.println("enter the 1st limit:");
int m=in.nextInt();
System.out.println("enter the 2nd limit:");
int n=in.nextInt();
System.out.println("prime numbers between"+m +"and"+n +"are:");
for(int j=m;j<=n;j++)
{
count=0;
for(i=1;i<=j;i++)
{
if(j%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println(j+"");
}
}
}
}