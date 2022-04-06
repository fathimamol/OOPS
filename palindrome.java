import java.util.*;

public class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the word");
String str=sc.nextLine();
int size = str.length();
boolean ispalindrome=true;
for(int i=0;i<size/2;i++)
{
if(str.charAt(i)==str.charAt(size-i-1))
continue;
else
{
ispalindrome=false;
break;
}
}
if(ispalindrome)
System.out.println("the string"+str+"is a palindrome");
else
System.out.println("the string"+str+"is not a palindrome");
}
}

