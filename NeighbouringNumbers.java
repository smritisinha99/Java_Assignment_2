/*Name: Smriti Sinha
PRN: 21070126090
Branch: AI/ML-B1
 */

//Nearest Neighbour
import java.util.Scanner;
public class NeighbouringNumbers {
    // This function takes an integer array as input and returns the index of the pair of neighboring elements
    // with the smallest absolute difference
    public static int findSmallestDistanceIndex(int[] arr) {
        int minIndex = 0; // The index of the first element in the pair with the smallest absolute difference
        int minDiff = Integer.MAX_VALUE; // The smallest absolute difference so far

        // Loop through each neighboring pair in the array
        for (int i = 1; i < arr.length; i++) {
            // Calculate the absolute difference between the two neighboring elements
            int diff = Math.abs(arr[i] - arr[i-1]);
            // If the absolute difference is smaller than the current minimum, update the minimum
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i-1; // Update the index of the first element in the pair with the smallest absolute difference
            }
        }

        // Return the index of the pair with the smallest absolute difference
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int n = scanner.nextInt();

        // Create an array with the given length and ask the user to enter its elements
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find the index of the pair of neighboring elements with the smallest absolute difference
        int index = findSmallestDistanceIndex(arr);

        // Print the index of the pair with the smallest absolute difference
        System.out.println("Index of neighboring numbers with smallest distance: " + index);
    }
}