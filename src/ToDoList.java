import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("here is your stored values you typed in");
        myArray(a, b, c);
        findMin(a, b, c);


    }

    static int[] myArray(int a, int b, int c) {
        int[] Arr = new int[3];
        Arr[0] = a;
        Arr[1] = b;
        Arr[2] = c;
        System.out.println(Arrays.toString(Arr));
        return Arr;
    }

    static void findMin(int a, int b, int c) {
        int[] store = myArray(a, b, c);
        int min = store[0];
        for (int i = 0; i < store.length; i++) {
            if (min > store[i]) {
                min = store[i];
            }
        }
        System.out.println("the minimum element is: " + min);

    }
}
