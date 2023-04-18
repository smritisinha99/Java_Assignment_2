/*Name: Smriti Sinha
PRN: 21070126090
Branch: AI/ML-B1
 */
//Even Odd Array

import java.util.Scanner;
 public class EvenOddArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // declaring arrays to store even and odd numbers
        int[] even = new int[size];
        int[] odd = new int[size];

        int evenIndex = 0;
        int oddIndex = 0;

        // accept numbers from user and move them to respective arrays
        for(int i=0; i<size; i++) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if(num % 2 == 0) {
                even[evenIndex] = num;
                evenIndex++;
            } else {
                odd[oddIndex] = num;
                oddIndex++;
            }
        }

        // print even and odd arrays
        System.out.println("Even numbers:");
        for(int i=0; i<evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        System.out.println("\nOdd numbers:");
        for(int i=0; i<oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
    }
}
