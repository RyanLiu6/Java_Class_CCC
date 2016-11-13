import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
        int size = scan_int();
        int sum = exercise_1(size);
        System.out.println(sum);

        int n = scan_int();
        System.out.println("Printing a Triangle");
        print_triangle(n);
        System.out.println("Printing a Pyramid");
        print_pyramid(n);

        guess_game();

        array_flip(size);
        */

        homework();

        /* Homework due before 11:59PM, Saturday
         * 1.
         * a. Ask the user for input
         * b. Check if its odd or even
         * c. Check if its prime or not
         * d. Check if it is a palindrome (121 is and 123 is not)
         *
         * This week's homework is fairly easy, but later weeks will get harder.
         * Send me a Main file with the above done in a function. I expect functions
         * that take in variables.
         * Do not hardcode as I will be running random test cases.
         */
    }

    private static void homework() {
        // a. Ask user for input
        int num = scan_int();

        // b. Check if its odd or even
        int mod = num % 2;
        if (mod == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        // c. Check if it's prime or not
        boolean prime = true;
        int divisor = 0;

        // Why does i not start at 0 or 1?
        int i = 2;
        while (i < num && prime) {
            if (num % i == 0) {
                divisor = i;
                prime = false;
            }
            i++;
        }

        if (prime) {
            System.out.println(num + " is a Prime number.");
        }
        else {
            System.out.println(num + " is not a Prime number.");
            System.out.println(num + " can be divided by " + divisor);
        }

        // d. Palindrome
        String num_str = Integer.toString(num);
        /* Can check to see how many odds exist in String
         * Remember, any String / Number is a Palindrome iff:
         * It has either 0 or 1 odds: 4224 424 525 etc
        */

        // Easiest way:
        if(num_str.equals(new StringBuilder(num_str).reverse().toString())) {
            System.out.println(num + " is a Palindrome");
        }
        else
            System.out.println(num + " is not a Palindrome");

        // Manual way
        char[] num_char = num_str.toCharArray();
        int size = num_char.length;
        boolean palin = true;
        int j = 0;
        while (j < size && palin) {
            if (size % 2 == 0) {
                if (num_char[j] != num_char[size-j]) {
                    palin = false;
                }
            }
            else {
                if (j == (size/2 + 1)) {
                    break;
                }
                if (num_char[j] != num_char[size-j-1]) {
                    palin = false;
                }
            }
            j++;
        }

        if (palin) {
            System.out.println(num + " is a palindrome");
        }
        else {
            System.out.println(num + " is not a palinidrome");
        }
    }


    /* Input: n specifying size of array
     * Return: sum of the sequence of 1, 2, 3 ... n
     */
    private static int exercise_1(int n) {
        int[] arr = new int[n];
        int sum = 0;

        // Filling array with correct values
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        // Finding the sum of the values in the array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /* Input: n
     * Prints n stars in a right triangle format
     */
    private static void print_triangle(int n) {
        // For each row
        for (int i = 0; i < n; i++) {
            // Print row amount of stars
            // ex. row 3, print 3 stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    /* Input: n
     * Prints n stars in a pyramid format
     */
    private static void print_pyramid(int n) {
        int space = n-1;
        for (int i = 0; i < n; i++) {
            print_space(space);
            space--;
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    /* Function to check if user_input and actual answer
     * are the same. Prints the result after.
     */
    private static void guess_verify(int user_input, int ans) {
        if (user_input < ans) {
            System.out.println("Wrong! Number is too low. Please try again: ");
        }
        else if (user_input > ans) {
            System.out.println("Wrong! Number is too high. Please try again: ");
        }
    }

    private static void guess_game() {
        int crown = randInt(1,100);
        int user_input;

        System.out.println("Now entering guessing game ...");
        System.out.println("The number will be between 1 and 100 ...");
        System.out.println("Enter 0 if you wish to quit ...");

        do {
            user_input = scan_int();
            if (user_input == 0)
                break;

            guess_verify(user_input, crown);

        } while (user_input != crown);

        if (user_input == crown)
            System.out.println("Right! You got it!");
        System.out.println("Thanks for playing!");
    }

    private static void array_flip(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        print_arr(arr);

        for (int i = 0; i < (n/2); i++) {
            int temp = arr[i];
            int end = n - i - 1;
            arr[i] = arr[end];
            arr[end] = temp;
        }

        print_arr(arr);
    }

    /**
     * Returns a pseudo-random number between min and max, inclusive.
     * The difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value.  Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    private static int randInt(int min, int max) {

        // NOTE: This will (intentionally) not run as written so that folks
        // copy-pasting have to think about how to initialize their
        // Random instance.  Initialization of the Random instance is outside
        // the main scope of the question, but some decent options are to have
        // a field that is initialized once and then re-used as needed or to
        // use ThreadLocalRandom (if using at least Java 1.7).
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive

        return rand.nextInt((max - min) + 1) + min;
    }

    /* Input: n
     * Prints n spaces in a row
     */
    private static void print_space(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    /* Iterates through an array of integers,
     * and simply prints it to the console
     */
    private static void print_arr(int arr[]) {
        int size = arr.length;

        for (int anArr : arr) {
            System.out.print(anArr + " ");
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
