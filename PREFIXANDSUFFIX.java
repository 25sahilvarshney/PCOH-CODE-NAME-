package PCPH;
import java.util.Scanner;
public class PREFIXANDSUFFIX
{
	static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	
	static int[] Prefix(int[] arr)
	{
	  int n = arr.length;
	  int[] pref = new int[n];
	  pref[0] = arr[0];
	  for(int i = 1; i < n; i++)
	  {
		  pref[i] = pref[i-1] + arr[i];
	  }
	  return pref;
		
	}
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter array size:");
		int n = obj.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter" + n + "elements");
		for(int i = 0; i < n; i++)
		{
			arr[i] = obj.nextInt();
		}
		System.out.println("Input Array");
		printArray(arr);
		
		int[] pref = Prefix(arr);
		printArray(pref);
	}

}
