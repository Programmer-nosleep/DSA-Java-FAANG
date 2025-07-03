import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Main mn = new Main();

       int[] array1 = {1,2,3,4,5}, array2 = {5,4,3,2,1};
       boolean result = mn.permutation(array1, array2);
       System.out.println(result);
    }

    public boolean permutation(int[] first, int[] second) {
       if (first.length != second.length)
           return false;

       int sum1 = 0, sum2 = 0;
       int mul1 = 1, mul2 =1;

       for (int i = 0; i < first.length; i++) {
           sum1 += first[i]; sum2 += second[i];
           mul1 *= first[i]; mul2 *= second[i];
       }

       if (sum1 == sum2 && mul1 == mul2) {
           return true;
       }

       return false;
    }
}
