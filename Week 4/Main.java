import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        int n = 100;
        // Testing students for knowledge from last class
        System.out.println("Exercise 1: ");
        exercise_1(n);

        /* Introduction to arrays:
         * Arrays can be thought of as drawers, and you can pull
         * out the drawers to access the different things stored
         * inside the different levels.
         * Below are examples of array reads and writes
         */
        // Setting result from exercise_2() into array
        System.out.println("Exercise 2: ");
        int arr_1[] = exercise_2();
        print_arr(arr_1);

        System.out.println("Exercise 3: ");
        int arr_2[] = exercise_3(n);
        print_arr(arr_2);

        // Introduced concept of Fibonacci numbers
        // Asked to implement it using a for / while loop
        int size = 11;
        int arr_3[] = fib_loop(size);
        System.out.println("Fibonacci Loop: ");
        print_arr(arr_3);

        /* Modified Fibonacci code to do something similar:
         * 1 2 2 4 8 32 256 ..
         */
        int arr_4[] = fib_loop_2(size - 2);
        System.out.println("Modified Fibonacci Loop: ");
        print_arr(arr_4);

        // Taking in keyboard input using scan_string() function
        String input = scan_string();

        // Using substring to display the first character
        String A = input.substring(0, 1);
        System.out.println("Priting first character of Input: ");
        System.out.print(A + " ");

        /* Was not covered in class:
         * Can convert a string into a array of char
         * Char = an individual character ie A, B, a, K, z ..
         * Strings = combination of characters
         */
        char[] arr_5 = input.toCharArray();
        System.out.println("\nPrinting values using a regular for loop :");
        for (int i = 0; i < arr_5.length; i++) {
            System.out.print(arr_5[i] + " ");
        }

        System.out.println("\nPrinting values using a for each loop :");
        for (char a : arr_5) {
            System.out.print(a + " ");
        }
    }

    /* Create a function that displays:
     * 1, 3, 5, 7, 9, 11, 13 ....
     */
    private static void exercise_1(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(2*i + 1 + " ");
        }

        System.out.print("\n");

        int j = 0;
        while (j < n) {
            System.out.print(2 * j + 1 + " ");
            j++;
        }
        System.out.print("\n");
    }

    /* Storing 1, 2, 3, 4, 5, 6 ...
     * into an array and returning array to main
     */
    private static int[] exercise_2() {
        // Standard array initialization with 10 elements
        int n = 10;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    /* Storing 1, 3, 5, 7, 9, 11 ...
     * into an array and returning array to main
     */
    private static int[] exercise_3(int n) {
        // Standard array initialization with 10 elements
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = 2*i + 1;
        }
        return arr;
    }

    /* Doing Fibonacci using loops
     */
    private static int[]fib_loop(int n) {
        // Standard array initialization with 10 elements
        int arr[] = new int[n];

        // Setting the initial values for the fibonacci sequence
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr;
    }


    /* Doing modified Fibonacci using loops
     */
    private static int[]fib_loop_2(int n) {
        // Standard array initialization with 10 elements
        int arr[] = new int[n];

        // Setting the initial values for the fibonacci sequence
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-2]*arr[i-1];
        }
        return arr;
    }

    /* Iterates through an array of integers,
     * and simply prints it to the console
     */
    private static void print_arr(int arr[]) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    /* Scans input for an integer
     */
    private static int scan_int() {
        // Uses Scanner to read an input
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a key: ");
        String input = sc.nextLine();

        // Turns input into an Integer
        return Integer.parseInt(input);
    }

    /* Scans input for a string
     */
    private static String scan_string() {
        // Uses Scanner to read an input
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a key: ");
        return sc.nextLine();
    }
}
