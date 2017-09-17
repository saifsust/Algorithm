import java.util.*;
import java.lang.*;
class Main{

private static final int N=100;
private static Vector[] divisorList = new Vector[N+3];
 
 private static void findDivisorList()
 {
         

 	  for(int i=1;i<=N;i++)
 	  {
 	  	   divisorList[i] = new Vector<Integer>();
 	  	  for(int j=i;j<=N;j+=i)
 	  	  {
            divisorList[i].add(j);
 	  	  }
 	  }

 }

public static void main(String[] args)
{
  findDivisorList();
  Scanner read = new Scanner(System.in);
  while(read.hasNext())
  {
     int num = read.nextInt();
     for(int i=0;i<divisorList[num].size();i++)
     	{
     		System.out.println(divisorList[num].get(i));
     	}
  }

}

}