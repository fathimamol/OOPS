import java.util.*;
class arrayList
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of strings: ");
int max = sc.nextInt();
List<String> list = new ArrayList<String>();
System.out.println("Enter the strings: ");
for(int i=0; i<max; i++)
list.add(sc.next());
list.set(1,"Fathima");
Iterator itr = list.iterator();
System.out.println("Entered Strings are: ");
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}

Output

Enter the number of strings:
3
Enter the strings:
preema
sahla
salshi
Entered Strings are:
preema
Fathima
salshi