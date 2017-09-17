import java.util.*;
public class prime{

private static final int N= 100000000;
private static int[] Prime = new int[N+10];
  private static void sieve()
  {
  	Arrays.fill(Prime,1);
  	for(int i=4;i<=N;i+=2) Prime[i]=0;
  		Prime[1]=0;
  	    Prime[0]=0;
     int limit = (int) Math.sqrt(N);
  	for(int i=3;i<=N;i+=2)
  	{
  		if(Prime[i]==1){
  			if(i<=limit)
           for(int j=i*i;j<=N;j+=i*2)
           {
             Prime[j]=0;
           }
       }
  	}

  }

   private static void primeAmount()
   {

   for(int i=1;i<=N;i++)
   {
     Prime[i]+=Prime[i-1];
   }

   }


	public static void main(String[] args)
	{
       sieve();
       primeAmount();
       Scanner read = new Scanner(System.in);
       while(read.hasNext())
       {
       	  int to = read.nextInt();
       	  int from = read.nextInt();
       	  System.out.println(Prime[from]-Prime[to]);
       }
       	read.close();

	}
}