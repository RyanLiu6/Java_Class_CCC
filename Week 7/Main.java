import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        int res_1 = j1_2016();
        System.out.println(res_1);

        String res_2 = j2_2016();
        System.out.println(res_2);
    }

    private static int j1_2016() throws IOException {
        FileReader input = new FileReader("C:/Users/Ryan/Desktop/input2.txt");
        BufferedReader read = new BufferedReader(input);

        String str = read.readLine();
        ArrayList<String> input_list = new ArrayList<String>();
        while (str != null) {
            input_list.add(str);
            str = read.readLine();
        }
        read.close();

        int count = 0;

        for (String line : input_list) {
            if (line.equals("W")) {
                count++;
            }
        }

        if (count >= 5) {
            return 1;
        } else if (count >= 3) {
            return 2;
        } else if (count >= 1) {
            return 1;
        } else {
            return -1;
        }
    }

    // Incomplete
    private static String j2_2016() throws IOException {
        int[][] iArr = new int[4][4];

        FileReader input = new FileReader("C:/Users/Ryan/Desktop/j2.1a.in");
        BufferedReader read = new BufferedReader(input);

        String str = read.readLine();
        ArrayList<String> input_list = new ArrayList<String>();
        while (str != null) {
            input_list.add(str);
            str = read.readLine();
        }


        /*for (int i = 0; i < 3; i++) {
            char[] cArr = input_list.get(i).toCharArray();
            for (int j = 0; j < 3; j++) {

                iArr[i][j] = cArr[]
            }
        }*/

        read.close();
        String result = "Magic Square";
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum = sum + iArr[i][j];
            }
            if (sum != 34) {
                result = "Not a magic square";
            }
        }

        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum = sum + iArr[i][j];
            }
            if (sum != 34) {
                result = "Not a magic square";
            }
        }
        return result;
    }
}