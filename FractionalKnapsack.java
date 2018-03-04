package algorithms;
import java.io.*;
public class FractionalKnapsack {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int weight[]=new int[100];
		float profit[]=new float[100];
		int obj[]=new int[100];
		float pw[]=new float[100];
		int n;
		int k;
		float kvalue=0;
		System.out.print("\tDemonstration of Greedy Programming with Fractional Knapsack\n\t@Nishant Amoli,Btech IT\n\n");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number of objects");
		n=Integer.parseInt(br.readLine());
		System.out.print("Enter capacity of knapsack");
		k=Integer.parseInt(br.readLine());
		System.out.print("Enter objects");
		for(int i=0;i<n;i++)
			obj[i]=Integer.parseInt(br.readLine());
		System.out.print("Enter profit");
		for(int i=0;i<n;i++)
			profit[i]=Integer.parseInt(br.readLine());
		System.out.print("Enter weight");
		for(int i=0;i<n;i++)
			weight[i]=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
			pw[i]=profit[i]/weight[i];
		System.out.print("\nProfit/Weight:\n");
		for(int i=0;i<n;i++)
			System.out.print(pw[i]+"  ");
		
		while(k>0)
		{
			int max=0;
			for(int i=1;i<n;i++)
			{
				if(pw[max]<pw[i])
					max=i;				
			}
			if(weight[max]<=k)
			{
				kvalue=kvalue+profit[max];
				k=k-weight[max];
				pw[max]=0;
			}
			else
			{
				kvalue=kvalue+(k*pw[max]);
				k=0;
			}
		}
		
		System.out.print("\nMax value="+kvalue);
		
		

	}

}
