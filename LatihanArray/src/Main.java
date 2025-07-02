import java.io.*;

public class Main {
    public static void middle(int[] array) {
        // TODO
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    public static void main(String[] args) throws IOException {
        /*BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many day\'s temperatures? ");
        int days = Integer.parseInt(console.readLine());
        int[] temps = new int[days];

        // record temperatures and find average
        int sum = 0;
        int i = 0;

        while (i < days) {
            System.out.printf("day\'s %d high temp : ", (i + 1));
            temps[i] = Integer.parseInt(console.readLine());
            sum += temps[i];
            i++;
        }

        double average = (double) sum / days;

        // count days above average
        int above = 0;

        for (int num = 0; num < temps.length; num++) {
           if (temps[num] > average) {
               above++;
           }
        }

        System.out.println();
        System.out.println("Average Temp = " + average);
        System.out.printf("%d days above temp\n", above);*/

        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            // myArray[i] += 1;
            myArray[i] = i + 1;
        }

        middle(myArray);
    }
}
