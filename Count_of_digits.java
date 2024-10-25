package PCPH;
import java.util.Scanner;
public class Count_of_digits
{
	public static void main(String[] args)
	{
	System.out.println("Enter the number :");
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    int count = 0;
    while(n>0){
        n = n/10;
        count++;
        
    }
    System.out.println(count);    
}
}