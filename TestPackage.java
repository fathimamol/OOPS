import org.shapes.*;
import java.util.*;
class TestPackage
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the side of Square:");
int s=sc.nextInt();
Square sq=new Square(s);
System.out.println("Area of square is "+sq.area());
System.out.println("Enter the radius of Circle:");
int r=sc.nextInt();
Circle1 ci=new Circle1(s);
System.out.println("Area of Circle is "+ci.area());
System.out.println("Enter the side1 of Triangle:");
int s1=sc.nextInt();
System.out.println("Enter the side2 of Triangle:");
int s2=sc.nextInt();
System.out.println("Enter the side3 of Triangle:");
int s3=sc.nextInt();
Triangle t=new Triangle(s1,s2,s3);
System.out.println("Area of Triangle is "+t.area());
}
}