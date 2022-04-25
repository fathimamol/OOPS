import java.util.*;
class Shape
{
    void area(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class overloadedfn
{
     public static void main(String args[]) 
	{
	   Shape ob = new Shape();
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter the length of square\n");
           int sl=sc.nextInt();
	   ob.area(sl);
           System.out.println("Enter the length and breadth of rectangle\n");
           int l=sc.nextInt();
           int b=sc.nextInt();
	   ob.area(l,b);
           System.out.println("Enter the radius of Circle\n");
           Double r=sc.nextDouble();
	   ob.area(r);
        }
}
