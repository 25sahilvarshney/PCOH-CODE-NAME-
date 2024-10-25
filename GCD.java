package PCPH;
import java.util.Scanner;
public class GCD 
{

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner (System.in);
		System.out.println("enter the number = ");
		int n = obj.nextInt();
		System.out.print("enter the number = ");
		int m = obj.nextInt();
		while(n !=0)
		{
			 int temp = n;
			       n= m %n;
			         m =temp;         
		}
		   System.out.print(m);
}
}