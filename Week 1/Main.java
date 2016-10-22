import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        /* Uses System to print to console
         * Introduces concept of variable and variable types
         * 1. Integers: int x = 23;
         * 2. Strings: String str = "Good bye";
         * 3. Double / Float / Long: double y = 3.14159;
         * 4. Boolean: boolean bool = false;
         *
         * Introduced idea of automatic type conversation
         */
        String first = "Hello World!\n";
        System.out.println(first);

        String second = "I have ";
        String third = "5 apples.";

        // Printing out more than one variable using the + operator
        System.out.println(first + second + third);

        /* Relating Math and Coding together
         * 1. Assignment using =: int x = 23;
         * 2. Arithmetic: int x = 5 + 6;
         *  a) %: Modulus returns remainder for division
               int x = 5 % 2, x = 1; int y = 4 % 2, y = 0
         * 3. Unary operators:
         *  a) int x = 5;
               x++;
               System.out.println(x);
         */
        int a = 10;
        int b = 20;
        int c = a + b;
        // Check if c = 10 + 20 = 30
        System.out.println("10 + 20 = " + c);

        int d = a % 5;
        // Check answer of 10 % 5 = 0
        System.out.println("10 % 5 = " + d);

        a++;
        b++;
        // Check if answer = 11 + 21 = 32
        System.out.println("11 + 21 = " + (a + b));

        // Uses Scanner to read an input
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a key: ");
        String input = sc.nextLine();

        // Turns input into an Integer
        int x = Integer.parseInt(input);

        // Overwriting third st it is now only oranges
        third = " oranges";
        // Using the user input, we can set I have x oranges
        System.out.println(second + x + third);
    }
}
