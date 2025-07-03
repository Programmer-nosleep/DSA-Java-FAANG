import java.util.Arrays;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    // Time Complexity is O(n^2)
    public void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // O(n)
            for (int j = 0; j < arr.length; j++) { // O(n)
               System.out.println(arr[i] + ", " + arr[j]); // O(1)
            }
        }
    }

    public static void main(String[] args) {
       try {
           BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
           System.out.print("enter number (comma-separeted): ");
           String input = bfr.readLine();

           String[] splitComma = input.split(",");
           int[] customArray = new int[splitComma.length];

           int i = 0;
           for (String inputNum : splitComma) {
               customArray[i] = Integer.parseInt(inputNum.trim());
               i++;
           }

            System.out.println("Array : " + Arrays.toString(customArray));

           Main main = new Main();
           main.printPairs(customArray);

       } catch (IOException | NumberFormatException e) {
           System.err.println("Exception: " + e.getMessage());
       }
    }
}
