import java.util.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public void reverse (int[] arr) {
        // O(n/2)
       for (int i = 0; i < arr.length / 2; i++) {
           // technique swapping, Time Complexity O(1)
          int other = arr.length - i - 1;
          int temp = arr[i];
          arr[i] = arr[other];
          arr[other] = temp;
       }
        // O(n)
       System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        try {
           BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
           System.out.print("");
           String input = buffReader.readLine();

           String[] splitChar = input.split(",");
           int[] customArrayA = new int[splitChar.length];

           int i = 0;
           for (String strVal : splitChar) {
               customArrayA[i] = Integer.parseInt(strVal.trim());
               i++;
           }

           /*int[] customArrayB = Arrays.copyOf(customArrayA, customArrayA.length);*/

           System.out.println("A : " + Arrays.toString(customArrayA));
           /*System.out.println("B : " + Arrays.toString(customArrayB));*/

           Main main = new Main();
           main.reverse(customArrayA);
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
