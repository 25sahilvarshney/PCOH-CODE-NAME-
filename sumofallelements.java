package PCPH;

public class sumofallelements 
{

	public static void main(String[] args)
	{
		int a[] = {4,3,4,6,5};
		int sum = 0;
		for(int i = 0 ; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.print("sum of all elements in array = " + sum );
	}
	

}
