import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        // Uses Scanner to read an input
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a key: ");
        String input = sc.nextLine();

        // Turns input into an Integer
        int x = Integer.parseInt(input);

        // Implemented 3 different functions that I 
        // asked students to do. This is my solution
        int y = calc(x);
        int z = calc2(y);
        double u = calc3(z);

        // Printing out final results from each function call
        System.out.println(y);
        System.out.println(z);
        System.out.println(u);
    }

    public static int calc(int a) {
        /* Arbitrary function 1:
         * 1. Getting students used to the idea of Functions
         * 2. Getting students used to if / else flow control
         */
        int z = a*a + 2*a + 1;

        if (z % 2 == 0) {
            System.out.println("Is a multiple of 2");
        }
        else
            System.out.println("Is not a multiple of 2");

        return z;
    }

    public static int calc2(int x) {
        /* Arbitrary function 1:
         * Getting students used to if / else if / else flow control
         */
        int result;
        if (x > 100) {
            result = x % 100;
            return result;
        }
        else if (x > 5 && x < 50) {
            result = x*x + 2*x + 5;
            return result;
        }
        else
            return x;
    }

    public static double calc3(int x) {
        /* Arbitrary function 1:
         * 1. Testing student's knowledge on if flow control building on last example
         * 2. Creating a trick with int input and sqrt function, thus result has to be
         * of type double. Many students forgot about doubles and simply used only int.
         */
        double result;

        if (x > 100) {
            result = sqrt(x);
            return result;
        }
        else if (x > 4 && x < 50) {
            result = x*x + 4;
            return result;
        }
        else
            result = x + 6;
            return result;
    }
}
