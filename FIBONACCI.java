package PCPH;
import java.util.Scanner;
public class FIBONACCI {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        
        for(int i = 0 ; i < n ; i++)
        {
        	System.out.print(num1 + " ");
        	int num3 = num2+num1;
        	num1= num2;
        	num2 = num3;
        	
        }
       
	}

}
