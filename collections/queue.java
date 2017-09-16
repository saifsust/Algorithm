import java.util.*;


public class queue{
	public static void main(String[] args)
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		Scanner read = new Scanner(System.in);
		while(read.hasNext())
		{
			int num = read.nextInt();
			for(int i=1;i<=num;i++){
			//queue.add(i*1000);
				queue.offer(i);
		}
		// while(!queue.isEmpty())
		// {
		// 	int n= queue.poll();
			
		// 	System.out.println(n);
		// }

      while(!queue.isEmpty())
      {
      	int n=queue.element();
      	//int n= queue.peek();
      	System.out.println(n);
      	queue.remove();
      }

		///System.out.println(queue.hashCode());
        

		}
		read.close();


	}
}