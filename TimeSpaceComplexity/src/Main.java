import java.util.Arrays;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// import java.util.Scanner;

public class Main {
    void spofArray(int[] arr) {
        int sum = 0;
        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        System.out.println(sum + ", " + product);
    }

    public static void main(String[] args) {
        try {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter numbers (comma-separated): ");
            String inputLine = bfr.readLine();  // e.g., 1,2,3,4

            String[] split = inputLine.split(",");
            int[] customArray = new int[split.length];

            for (int i = 0; i < split.length; i++) {
                customArray[i] = Integer.parseInt(split[i].trim());
            }

            System.out.println("Your array: " + Arrays.toString(customArray));

            Main main = new Main();
            main.spofArray(customArray);

        /*
            int[][] mat2x2;
            mat2x2 = new int[2][2];

            mat2x2[0][0] = 1;
            mat2x2[0][1] = 2;
            mat2x2[1][0] = 3;
            mat2x2[1][1] = 4;

            System.out.println(Arrays.deepToString(mat2x2));

            String str2d[][] = {{"a", "b"}, {"c", "d"}};
            System.out.println(Arrays.deepToString(str2d));
        */
        } catch (IOException | NumberFormatException e) {
            System.out.println("Exception is : " + e.getMessage());
        }
    }
}
