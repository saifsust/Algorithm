import java.util.*;
public class vector{
	


	public static void main(String[] args)
	{

		Vector<Integer> vc = new Vector<>();
		Scanner read = new Scanner(System.in);
		while(read.hasNext())
		{
          int num = read.nextInt();
          for(int i=1;i<=num;i++)
          {
          	vc.add(i*1000);
          }
          //first element
          System.out.println("first element "+vc.firstElement());
          //last element
          System.out.println(" last element "+vc.lastElement());
          for(int i=0;i<vc.size();i++)
          {
          	System.out.println(vc.get(i));
          }
          //indexof 
          System.out.println(vc.indexOf(7000));


		}

	}
}