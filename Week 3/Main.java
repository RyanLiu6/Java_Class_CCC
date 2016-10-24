import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        // Taking in keyboard input using scan_string() function
        String input =  scan_string();

        // Checking if input is the same as my name
        boolean A = check_name(input);

        // Printing out result
        if (A)
            System.out.println(A + "! " + input + " is my name.");
        else
            System.out.println(A + "! " + input + " is not my name");

        // Arbitrary function
        int B = calc(A);
        System.out.println(B);

        /* Introduced for and while loops
         * Application:
         * 1. Arithmetic sum
         * 2. Geometric series with 1 + 1/2 + 1/4 ...
         * 3. Arithmetic sequence
         * 4. Arithmetic sum with formula
         * 5. Geometric series with formula
         * 6. Arithmetic sequence with formula
         *
         * Looping through values takes a lot of time
         * Doing one calculation via a formula does not
         */
        // Some variables to play around with
        int start = 1;
        int end = 100;
        int d = 2;
        int n = 5;
        double r = 1.0/2.0;

        // First three functions are very specific
        int sum_1 = arith_sum(end);
        int sum_2 = (int) geo_ser();
        int sum_3 = arith_series(start, d, n);
        System.out.println("Arithmetic Sum of " + start + " to " + end + " is " + sum_1);
        System.out.println("Infinite series of 1 + 1/2 + 1/4 + 1/8 .. = " + sum_2);
        System.out.println("Difference sum from " + start + " with difference of " + d + " for " + n + " numbers is = " + sum_3);

        // Last three functions are the general form of the sum
        int sum_4 = arith_sum_gen(end);
        double sum_5 = geo_ser_gen(start, r);
        int sum_6 = arith_seq_gen(start, d, n);

        // Checking if they are the same
        cmp(sum_1, sum_4);
        cmp(sum_2, sum_5);
        cmp(sum_3, sum_6);
    }

    /* Simple comparison between strings
     * Tricky part: uses .equals instead of ==
     * since we are working with strings
     */
    private static boolean check_name(String name) {
        String check = "Ryan";
        return (name.equals(check));
    }

    /* Arbitrary function:
     * Returns 100 if input string = name
     * Returns 0 otherwise
     */
    private static int calc(boolean A) {
        if (A)
            return 100;
        else
            return 0;
    }

    /* Specific arithmetic sum:
     * returns 1 + 2 + 3 + 4 ... + input
     */
    private static int arith_sum(int input) {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        return sum;
    }

    /* Specific geometric series:
     * returns 1 + 1/2 + 1/4 + 1/8 ... = 2
     */
    private static double geo_ser() {
        double ini = 1;
        double sum = 0;

        while (ini > 0) {
            sum += ini;
            ini /= 2;
        }
        return sum;
    }

    /* Generalized arithmetic series using a loop
     * Form of: 1 + 3 + 5 + 7 + 9 ...
     * returns sum.
     */
    private static int arith_series(int initial, int d, int n) {
        int curr = initial;
        int sum = initial;
        for (int i = 1; i < n; i++) {
            curr += d;
            sum += curr;
        }
        return sum;
    }

    /* Generalized arithmetic sum with d = 1
     * and initial value = 1
     */
    private static int arith_sum_gen(int input) {
        return (input*(input+1)/2);
    }

    /* General geometric series formula using
     * initial value and r, multiplication factor
     */
    private static double geo_ser_gen(int initial, double mult) {
        return (initial*(1-Math.pow(mult, 1000000000.0)))/(1.0-mult);
    }

    /* General arithmetic formula.
     * No restrictions.
     */
    private static int arith_seq_gen(int initial, int d, int n) {
        int end = initial + (n-1)*d;
        return (n*(initial + end))/(2);
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

    /* Compares if two input values are the same
     */
    public static void cmp(double a, double b) {
        if (a == b) {
            System.out.println(a + " and " + b + " are the same.");
        }
        else
            System.out.println(a + " and " + b + " are not the same.");
    }
}
