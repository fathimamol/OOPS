import java.util.*;
class Employee
{
int eNo,eSalary;
String eName;
public Employee(int no,int sal,String name)
{
eNo=no;
eSalary=sal;
eName=name;
}
public void showData()
{
System.out.print("Emp_id="+eNo+" "+"Name="+eName+" "+"Salary="+eSalary);
System.out.println();
}
}
public class ArrObjects
{
public static void main(String args[])
{
System.out.println("Enter the number of employees:");
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
System.out.println("Enter employee details one by one:");
Employee employees[]=new Employee[n];
Scanner obj_emp=new Scanner(System.in);
int eid,esal;
String ename;
for(int i=0;i<n;i++)
{
System.out.println("Enter"+i+" employee details:");
System.out.println("Enter employee id: ");
eid=obj_emp.nextInt();
System.out.println("Enter employee name: ");
String name=obj_emp.next();
ename=new String(name);
System.out.println("Enter employee salary: ");
esal=obj_emp.nextInt();
Employee emp=new Employee(eid,esal,ename);
employees[i]=emp;
}
System.out.println("Employees are:\n");
for(Employee y:employees)
y.showData();
System.out.println("Enter employee number to search:");
int semp=obj.nextInt();
boolean found=false;
for(Employee e:employees)
{
if(semp==e.eNo)
{
found=true;
System.out.println("Employee found");
e.showData();
break;
}
}
if(!found)
{
System.out.println("Employee not found");
}
}
}
