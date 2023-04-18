/*Name: Smriti Sinha
PRN: 21070126090
Branch: AI/ML
 */

//Array to ArrayList
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayToArrayList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking the array from input of the user
        System.out.println("Enter the elements of the array (separated by spaces):");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        // Convert array to ArrayList
        ArrayList<String> list = new ArrayList<>(Arrays.asList(inputArray));
        System.out.println("ArrayList: " + list);

        // And now convert ArrayList to array
        String[] outputArray = new String[list.size()];
        list.toArray(outputArray);
        System.out.println("Array: " + Arrays.toString(outputArray));
    }
}