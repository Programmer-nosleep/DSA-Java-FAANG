import java.util.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    // Time Complexity is O(n^2)
    public static void printUnorderedPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // O(n)
            for (int j = i + 1; j < arr.length; j++) { // O(n - i - 1)
                System.out.println(arr[i] + ", " + arr[j]); // O(1)
            }
        }
    }

    public static void main(String[] args) {
       try {
          BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter number (comma-separeted): ");
          String input = buffread.readLine();

          String[] splitValue = input.split(",");
          int[] customArray = new int[splitValue.length];

          int i = 0;
          for (String strValue : splitValue) {
              customArray[i] = Integer.parseInt(splitValue[i].trim());
             i++;
          }

          System.out.println("Array : " + Arrays.toString(customArray));

          Main main = new Main();
          main.printUnorderedPairs(customArray);

       } catch (IOException | NumberFormatException e) {
          System.err.println("Exception : " + e.getMessage());
       }
    }
}
