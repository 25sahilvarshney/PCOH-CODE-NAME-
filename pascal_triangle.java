package PCPH;
import java.util.Scanner;
public class pascal_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows =");
        int r = sc.nextInt();
        for(int i =0 ; i <r ; i++)
        {
            System.out.print( 1 + " ");
             int prev = 1;
            for(int j = 1 ; j<=i ; j++)
            {
              int curr = prev*(i-j+1);
              curr = curr/j;
              System.out.print( curr + " ");
              prev = curr;
            }
        System.out.println();
        }
    }


}

