import java.util.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // Time Complexity is O(n^3)
    public void printUnorderedPairs(int[] A, int[] B) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                for (int k = 0; k < 100_000; k++) {
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

          int i = 0;
          for (String strvalue : splitChar) {
             customArrayA[i] = Integer.parseInt(strvalue.trim());
             i++;
          }

          int[] customArrayB = Arrays.copyOf(customArrayA, customArrayA.length);

          System.out.println("A : " + Arrays.toString(customArrayA));
          System.out.println("B : " + Arrays.toString(customArrayB));

          Main main = new Main();
          main.printUnorderedPairs(customArrayA, customArrayB);
       } catch (IOException | NumberFormatException e) {
           throw new RuntimeException(e);
       }
    }
}
