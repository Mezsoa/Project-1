import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("here is your stored values you typed in");
        int[] arr = myArray(a, b, c);
        findMin(arr);
*/
        String input = scan.nextLine();
        int[] arr = readIntegers(input);
        System.out.println(Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println(min);





    }
//this is with a string method so that i can generate input simply by typing the numbers and separating them with a ",".
    static int[] readIntegers(String input) {
        String[] arrayInput = input.split(",");
        int[] arr = new int[arrayInput.length];
        for (int i = 0; i < arrayInput.length; i++) {
            arr[i] = Integer.parseInt(arrayInput[i].trim());
        }
        return arr;
    }
    // This array method need three separate inputs instead of the string that only needs one input.

    /* static int[] myArray(int a, int b, int c) {
        int[] Arr = new int[3];
        Arr[0] = a;
        Arr[1] = b;
        Arr[2] = c;
        System.out.println(Arrays.toString(Arr));
        return Arr;
    }
*/
    static int findMin(int[] myArray) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }
        return min;
    }
}
