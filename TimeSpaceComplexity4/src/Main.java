import java.util.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    // Time Complexity is O(n^2)
    public static void printUnorderedPairs(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
           for (int j = 0; j < B.length; j++) {
               // O(1)
               if (A[i] < B[j]) {
                   System.out.printf("%d, %d\n", A[i], B[j]);
               }
           }
        }
    }
    public static void main(String[] args) {
       try {
          BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
          System.out.print("");
          String input = buffRead.readLine();

          String[] splitChar = input.split(",");
          int[] customArrayA = new int[splitChar.length];
          /*int[] customArrayB = new int[splitChar.length];*/

          int i = 0;
          for (String strvalue : splitChar) {
              customArrayA[i] = Integer.parseInt(splitChar[i].trim());
              i++;
          }

          /*int j = 0;
          for (String strvalue : splitChar) {
              customArrayB[j] = Integer.parseInt(strvalue.trim());
              j++;
          }*/

           int[] customArrayB = Arrays.copyOf(customArrayA, customArrayA.length);

          System.out.println("Array : " + Arrays.toString(customArrayA));
          System.out.println("Array : " + Arrays.toString(customArrayB));

          Main main = new Main();
          main.printUnorderedPairs(customArrayA, customArrayB);

       } catch (IOException | NumberFormatException e) {
           throw new RuntimeException(e);
       }
    }
}
