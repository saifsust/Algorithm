import java.util.*;
public class deque{
/*
 like as stack
*/
public static void main(String[] args)
{
	Scanner read = new Scanner(System.in);
	Deque<Integer> dq = new LinkedList<>();

	while(read.hasNext())
	{
      int num = read.nextInt();
      for(int i=1;i<=num;i++)
      {
        dq.push(i*100);
      }


      while(!dq.isEmpty())
      {
        System.out.println(dq.pop());
      }

	}

		read.close();

}

}