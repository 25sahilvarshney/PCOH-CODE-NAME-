package PCPH;
public class BinarySearch 
{

	public static void main(String[] args) 
	{
		int n = 16;
		int low = 0;
		int high = n;
		while(low <high)
		{
			int mid =(high+low) / 2;
			if(mid*mid==n)
			{
				System.out.print(mid);
			}
			else if(mid*mid < n)
			{
				low = mid+1;
			}
			else
			{
			   high = mid - 1;	
			}
		    
		}
		
	}

}
