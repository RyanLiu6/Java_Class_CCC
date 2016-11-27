import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        /*
        int size_1 = scan_int();
        fib_1(size_1);
        System.out.print("\n");
        int fib_rec = fib_2(size_1);
        System.out.println(fib_rec + " ");
        calc(size_1);
        System.out.print("\n");

        String str = scan_string();
        reverse_str(str);
        */

        // cmp();

        // Introducing reading file input and output
        // Reading
        FileReader input = new FileReader("C:/Users/Ryan/Desktop/input.txt");
        BufferedReader read = new BufferedReader(input);

        String str = read.readLine();
        ArrayList<String> input_list = new ArrayList<String>();
        while(str != null) {
            input_list.add(str);
            str = read.readLine();
        }
        read.close();

        for (int i = 0; i < input_list.size(); i++) {
            System.out.print(input_list.get(i) + " ");
        }
        System.out.println();

        // Write
        File output = new File("C:/Users/Ryan/Desktop/output.txt");
        if (!output.exists()) {
            output.createNewFile();
        }
        FileWriter writer = new FileWriter(output);
        BufferedWriter write = new BufferedWriter(writer);

        for (int i = 0; i < input_list.size(); i++) {
            write.write("saem" + i);
            write.newLine();
        }
        write.close();
    }

    private static void cmp() {
        System.out.println("First Key is the base ...");
        int b = scan_int();
        System.out.println("Second Key is the exponent ...");
        int p = scan_int();

        int pow_res = (int) Math.pow(b, p);

        int rec_res = power(b, p);
        if (pow_res != rec_res) {
            System.out.println("pow_res = " + pow_res);
            System.out.println("rec_res = " + rec_res);
            System.out.println("You dun goof'd");
        }
        else {
            System.out.println("pow_res = " + pow_res);
            System.out.println("rec_res = " + rec_res);
            System.out.println("Great Job!");
        }
    }

    private static int power(int b, int p) {
        if (p == 0) {
            return 1;
        }
        return (b * power(b, --p));
    }

    private static String reverse_str(String str) {
        //return new StringBuilder(str).reverse().toString();
        char[] in = str.toCharArray();
        int begin=0;
        int end=in.length - 1;
        char temp;
        while(end>begin){
            temp = in[begin];
            in[begin]=in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        return new String(in);
    }

    private static void fib_1(int n) {
        int[] arr = new int[n];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int fib_2(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        else {
            int left = fib_2(n - 1);
            int right = fib_2(n - 2);
            return left + right;
        }
    }

    private static void calc(int n) {
        System.out.print(n + " ");
        if (n > 0) {
            calc(--n);
        }
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
