package PCPH;
public class array_add1
{
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3};
        int number = 0;
        for (int i = 0; i < originalArray.length; i++) {
            number = number * 10 + originalArray[i];
        }
        number += 1;
        int numDigits = (int) Math.log10(number) + 1;

        int[] newArray = new int[numDigits];
        
        for (int i = numDigits - 1; i >= 0; i--) {
            newArray[i] = number % 10;
            number /= 10;
        }

        System.out.print("New Array: {");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
