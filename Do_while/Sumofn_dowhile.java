package core;
import java.util.Scanner;
public class Sumofn_dowhile
{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter N: ");
	        int n = sc.nextInt();

	        int sum = 0;
	        int i = 1;

	        do {
	            sum += i;
	            i++;
	        } while (i <= n);

	        System.out.println("Sum of first " + n + " numbers = " + sum);
	    }
}
