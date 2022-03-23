import java.util.*;
public class circle
{
public static void main(String args[])
{
Double r,area,perimeter;
Scanner input=new Scanner(System.in);
System.out.print("enter the radius");
r=input.nextDouble();
area=Math.PI*r*r;
perimeter=2*Math.PI*r;
System.out.println();
System.out.println("area of the circle="+area);
System.out.println("perimter of the circle="+perimeter);
}
}