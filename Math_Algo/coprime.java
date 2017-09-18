import java.util.*;
import java.lang.*;
class Main{

private static final int N=100000000;
private static int[] coprime = new int[N+5];
private static int[] mark = new int[N+5]; 
private static  void sievePhi()
{
	Arrays.fill(mark,0);
    for(int i=1;i<=N;i++)
    	coprime[i]=i;
    mark[1]=1;
    for(int i=2;i<=N;i+=2)
    {
    	if(i!=2) mark[i]=1;
    	coprime[i]=coprime[i]/2;
    }


    for(int i=3;i<=N;i+=2)
    {
    	if(mark[i]==0)
    	{
    		coprime[i]=coprime[i]-1;
    		for(int j=i*2;j<=N;j+=i)
    		{
    			mark[j]=1;
    			coprime[j]=(coprime[j]/i)*(i-1);
    		}
    	}
    }

    
}
public static void main(String[] args)
{


	sievePhi();

Scanner read = new Scanner(System.in);
  while(read.hasNext()){
  	int num = read.nextInt();
	// for(int i=1;i<=num;i++)
	// {
	// 	System.out.print(coprime[i]+" ");
	// }
	System.out.println(coprime[num]);
} 
read.close();


}

}