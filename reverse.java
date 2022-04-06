import java.util.*;
public class reverse
{
public static void main(String args[])
{
Scanner in= new Scanner(System.in);
System.out.println("enter the number:");
int rev=0,num;
num=in.nextInt();
while(num!=0)
{
	rev=rev*10;
    rev=rev+num%10;
    num=num/10;
}
System.out.println("Reverse of number is:"+rev);
}
}
