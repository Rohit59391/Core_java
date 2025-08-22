package core;

public class ReverseArray {

	public static void main(String[] args) 
	{
		int []arr = {1,2,3,4};
		System.out.println("original Arrya");
		for(int num:arr)
		{
			System.out.println(num+" ");
		}
		System.out.println("reverse arrya");
		for(int i =arr.length-1;i>=0;i--) 
		{
			System.out.println(arr[i]+"");
		}
	}

}
