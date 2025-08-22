// program for find total addition of no has devisible of 2.
package core;

public class Array2 
{
		public static void main(String[] args)
		{
			int[]arr=new int[100];
			for(int i=0;i<100;i++)
			{
				arr[i]=i+1;
			}
			int sum=0;
			for(int i=0;i<100;i++)
			
			{
			//	if(arr[i]%2==0)
				{
					sum=sum+arr[i];
				}
			}
			System.out.println(sum);
			
		}

	}

