package PCPH;
import java.util.Scanner;
public class Squarerootsforloops
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int c = n;
        for(int i = 0; i<=n; i++)
        {
            if(i*i ==c)
            {
                System.out.println(i);
            }     
         }
	}

}
