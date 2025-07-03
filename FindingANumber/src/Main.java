import java.util.Arrays;

public class Main {
    public void linearSearch(int[] intArray, int value) {
        boolean isFound = false;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == value) {
                System.out.println("value is found at the index of " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound)
            System.out.println(value + " is not found.");
    }

    public static void main(String[] args) {
        Main mn = new Main();
       int[] array = {1,2,3,4,5,6};
       mn.linearSearch(array, 6);
    }
}
