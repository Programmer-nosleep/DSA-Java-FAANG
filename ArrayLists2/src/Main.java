import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
        stringArrayList.add(5, "F");
        for (String letter : stringArrayList) {
            if (letter.equals("F")) {
                System.out.println("The element is found");
                break;
            }
        }

        int index = stringArrayList.indexOf("F");
        System.out.println("The element is found at index : " + index);

        stringArrayList.remove(2);
        System.out.println(stringArrayList);
    }
}
