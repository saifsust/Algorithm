import java.util.*;
public class deque{

public static void main(String[] args)
{
	Scanner read = new Scanner(System.in);
	Deque<Integer> dq = new LinkedList<>();

	while(read.hasNext())
	{
      int num = read.nextInt();
      for(int i=1;i<=num;i++)
      {
    dq.addFirst(i*100);
    dq.addLast(i*10000);
      }


      while(!dq.isEmpty())
      {
      	System.out.println(dq.pollFirst());
      	System.out.println(dq.pollLast());
      }

	}

		read.close();

}

}