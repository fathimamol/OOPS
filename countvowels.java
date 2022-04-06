import java.util.*;
public class countvowels
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.print("Enter a string:");
String str=in.nextLine();
System.out.print("Number of vowels in the string:"+countVowels(str)+"\n");
}
public static int countVowels(String str)
{
int count=0;
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
{
count++;
}
}
return count;
}
}
