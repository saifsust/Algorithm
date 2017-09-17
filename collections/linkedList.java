import java.util.*;
import java.lang.*;
import java.io.*;
public class linkedList{
	


	public static void main(String[] args) throws Exception
	{

		LinkedList list[] = new LinkedList[100];
		Scanner read = new Scanner(System.in);
		while(read.hasNext())
		{
          int num = read.nextInt();
          for(int i=0;i<num;i++)
          	list[i] = new LinkedList<Integer>();
          for(int i=0;i<num;i++)
          {
          	for(int j=1;j<num;j++)
          		list[i].add(j*1000);

          }
            for(int i=0;i<num;i++)
            {
            	for(int j=0;j<list[i].size();j++)
            		System.out.print(list[i].get(j)+" ");
            	System.out.println();
            }

         
		}

	}
}