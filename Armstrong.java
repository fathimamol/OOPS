import java.util.Scanner;
import java.lang.Math;

public class Armstrong
{
static void isArmstrong(int n)
{
int temp,digits=0,rem=0,sum=0;
temp=n;
while(temp>0)
{
temp=temp/10;
digits++;
}
temp=n;
while(temp>0)
{
rem=temp%10;
sum+=(Math.pow(rem,digits));
temp=temp/10;
}
if(n==sum)
System.out.println(n+"is an Armstrong number");
else System.out.println(n+"is not an Armstrong number");
}
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();
isArmstrong(num);
}
}
