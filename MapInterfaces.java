import java.util.*;
class MapInterfaces
{
public static void main(String args[])
{
System.out.println("Adding Elements");
Map<Integer, String> hm1 = new HashMap<>();
Map<Integer, String> hm2= new HashMap<Integer, String>();
hm1.put(1, "Adding 1");
hm1.put(2, "Adding 2");
hm1.put(3, "Adding 3");
hm2.put(new Integer(1), "value 1");
hm2.put(new Integer(2), "value 2");
hm2.put(new Integer(3), "value 3");
System.out.println(hm1);
System.out.println(hm2);
System.out.println("Changing Elements");
Map<Integer, String> hm3= new HashMap<Integer, String>();
hm3.put(new Integer(1), "ram");
hm3.put(new Integer(2), "lost");
hm3.put(new Integer(3), "raj");
System.out.println("Initial Map " + hm3);  
hm3.put(new Integer(2), "For");  
System.out.println("Updated Map " + hm3);
System.out.println("Removing Elements");	
Map<Integer, String> hm4= new HashMap<Integer, String>();
hm4.put(new Integer(1), "Fathima");
hm4.put(new Integer(2), "Preema");
hm4.put(new Integer(3), "Reshma");
hm4.put(new Integer(4), "Salshi");
System.out.println(hm4);
hm4.remove(new Integer(4));
System.out.println(hm4);
}
}

Output


Adding Elements
{1=Adding 1, 2=Adding 2, 3=Adding 3}
{1=value 1, 2=value 2, 3=value 3}
Changing Elements
Initial Map {1=ram, 2=lost, 3=raj}
Updated Map {1=ram, 2=For, 3=raj}
Removing Elements
{1=Fathima, 2=Preema, 3=Reshma, 4=Salshi}
{1=Fathima, 2=Preema, 3=Reshma}
