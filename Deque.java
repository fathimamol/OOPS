import java.util.ArrayDeque;
public class Deque
{
public static void main(String args[])
{
ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
dq.add(20);
dq.addFirst(15);
dq.add(34);
dq.add(45);
dq.addLast(75);
System.out.println(dq);
System.out.println("pop ():"+dq.pop());
System.out.println("poll ():"+dq.poll());
System.out.println("pollFirst ():"+dq.pollFirst());
System.out.println("pollLast ():"+dq.pollLast());
}
}

Output


[15, 20, 34, 45, 75]
pop ():15
poll ():20
pollFirst ():34
pollLast ():75				