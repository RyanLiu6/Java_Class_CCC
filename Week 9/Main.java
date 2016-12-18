import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("2009 CCC Junior");
        System.out.println("Question 1:");
        //j1_09();
        System.out.println("Question 2:");
        //j2_09();

        System.out.println("2008 CCC Junior");
        System.out.println("Question 1:");
        j1_08();
        System.out.println("Question 2:");
        //j2_08();
    }

    private static void j1_08() {
        System.out.print("Enter weight (kg): ");
        int weight = scan_int();

        System.out.print("Enter height (meters) : ");
        int height = scan_int();

        int BMI = weight/(weight*height);

        if (BMI > 25)
            System.out.print("Overweight");
        else if (BMI > 18.5)
            System.out.print("Normal weight");
        else
            System.out.print("Underweight");
    }

    private static void j2_08() {

    }

    private static void j1_09() {
        int prev = 91;
        System.out.print("Digit 11? ");
        int d_11 = scan_int();

        System.out.print("Digit 12? ");
        int d_12 = scan_int();

        System.out.print("Digit 13? ");
        int d_13 = scan_int();

        int sum = prev + d_11 + d_12*3 + d_13;
        System.out.print("The 1-3-sum is: " + sum);
    }

    private static void j2_09() {
        String brown = " Brown Trout, ";
        String north = " Northern Pike, ";
        String yellow = " Yellow Pickerel";

        System.out.print("Points per Trout: ");
        int trout = scan_int();

        System.out.print("Points per Pike: ");
        int pike = scan_int();

        System.out.print("Points per Pickerel: ");
        int pickerel = scan_int();

        System.out.print("Total Points: ");
        int total = scan_int();

        int count = 0;

        for (int i = 0; i <= total/trout; i++) {
            for (int j = 0; j <= pike/trout; j++) {
                for (int k = 0; k <= pickerel/trout; k++) {
                    if ((i > 0 || j > 0 || k > 0) && (i*trout + j*pike + k*pickerel <= total)) {
                        count++;
                        System.out.println(i + brown + j + north + k + yellow);
                    }
                }
            }
        }
        System.out.print("Number of ways to catch fish: " + count);
    }

    /* Scans input for an integer
     */
    private static int scan_int() {
        // Uses Scanner to read an input
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        // Turns input into an Integer
        return Integer.parseInt(input);
    }
}