import java.io.*;
import java.util.Arrays;

public class Main {
    // O(1)
    public static int multiplyNumbers(int n) {
        return n * n;
    }
    // O(n)
    public static void printNumbers(int n) {
        // O(2n)
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        System.out.println();
        // O(2n) dropping constant
        for (int j = 0; j < n; j++) {
            System.out.println(j);
        }
    }
    // O(n^2)
    public static void printNumbers2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
    // O(n^3)
    public static void printNumbers3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.printf("%d %d %d\n", i, j, k);
                }
            }
        }
    }
    // Non Dominant terms O(n^2) + O(n) = O(n^2 + n)
    public static void printNumbers4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }
    // O(n)
    public static int sumNumbers(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sumNumbers(n - 1);
    }
    // space complexity O(1)
    public static int pairSumSequence(int n) {
        var total = 0;
        for (int i = 0; i <= n; i++) {
            total += pairSum(i, i+1);
        }
        return total;
    }
    public static int pairSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(multiplyNumbers(10));
//        printNumbers(10);
//        printNumbers2(10);
//        printNumbers3(5);
//        printNumbers4(3);
//        System.out.println(sumNumbers(4));
//        System.out.println(pairSumSequence(3));

//        SingleDimensionArray sda = new SingleDimensionArray(10);
//        sda.insert(0, 10);
//        sda.insert(2, 20);
//        sda.insert(1, 30);
//
//        var firstElement = sda.arr[0];
//        System.out.println(firstElement);
//
//        var thirdElement = sda.arr[3];
//        System.out.println(thirdElement);
//
//        System.out.print("array traversal ");
//        sda.traverseArray();
//
//        System.out.println();
//
//        sda.searchInArray(10);
//        sda.searchInArray(20);
//        sda.searchInArray(50);
//
//        sda.deleteValue(0);
//        System.out.println(sda.arr[0]);

        MultiDimensionArray sda = new MultiDimensionArray(3,3);
        sda.insertValueInTheArray(0, 0, 10);
        sda.insertValueInTheArray(0, 1, 20);
        sda.insertValueInTheArray(1, 0, 30);
        sda.insertValueInTheArray(2, 0, 40);

        sda.searching(20);
        System.out.println(Arrays.deepToString(sda.arr));

//        sda.accessCell(0, 1);
        sda.traverse2DArray();
        sda.deleteValue(0, 0);
        sda.traverse2DArray();
    }
}