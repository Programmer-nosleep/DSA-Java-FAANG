import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0];
        }

        int[] result = new int[array.length - 2];
        for (int i = 1; i < array.length - 1; i++) {
            result[i - 1] = array[i];
        }
        return result;
    }

    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }

    public static int findMissingNumberInArray(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        int[] result = middle(myArray);

        for (int val : result) {
            System.out.print(val + " ");
        }

        System.out.println();

        int[][] myArray2D  = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(sumDiagonalElements(myArray2D));

        int[] myArray2 = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] topTwo = findTopTwoScores(myArray2);
        System.out.println("Top 1: " + topTwo[0] + ", Top 2: " + topTwo[1]);

        int[] missingArray = {1, 2, 4, 5};
        System.out.println("Missing Number: " + findMissingNumberInArray(missingArray));

        int[] arrayWithDuplicates = {1, 2, 2, 3, 4, 4, 5, 5};
        int[] withoutDuplicates = removeDuplicates(arrayWithDuplicates);
        System.out.print("Array tanpa duplikat: ");

        for (int val : withoutDuplicates) {
            System.out.print(val + " ");
        }

        System.out.println();

    }
}
