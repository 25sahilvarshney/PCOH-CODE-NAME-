package PCPH;

public class uniquearray 
{
	public static int funique(int a[] , int arr_size)
	{
		for(int i = 0 ; i < arr_size ; i++)
		{
			int count = 0;
			for(int j =0; j<arr_size ; j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			}
			if (count ==1)
			{
				return 1;
			}
		}
		return 1;
	}
    public static void main(String[] args) 
	{
		int arr[] = {5,2,2,2,4,4};
		int n = arr.length;
		System.out.println(funique(arr,n));

	}

}
