import java.util.*;
class StringManipulation
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.print("Enter the first string:");
String str=obj.nextLine();
System.out.print("Enter the second string:");
String str2=obj.nextLine();
System.out.println("Concatenation of strings:");
String str3=str.concat(str2);
System.out.println(str3);
System.out.println("Length of first string:"+str.length());
System.out.println("Character at position 4 in first string:"+str2.charAt(2));
System.out.println("Index of character 'd' in second string:"+str2.indexOf('d'));
}
}