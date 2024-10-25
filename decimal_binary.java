package PCPH;
import java.util.Scanner;
public class decimal_binary
{

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("enter the number:");
		int n = obj.nextInt();
		int size = 0;
		int tempdecimal = n;
		while(tempdecimal >0)
		{
			size++;
			tempdecimal = tempdecimal/2;
		}
		int [] binaryArray = new int[size];
		int index = size - 1;
		while(n > 0)
		{
			binaryArray[index--] = n %2;
			n =n /2;
		}
		System.out.print("decimal to binary number convert :");
		for(int binary : binaryArray)
		{
			System.out.print(binary);
		}
		

	}

}
