import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            int buff = 0;
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("masukan nilai string : ");
            String input = bfr.readLine();

            int IntegerInput = Integer.parseInt(input);
            while (buff < IntegerInput) {
                System.out.println("Hello, World!");

                // Changed to check 'buff' instead of 'IntegerInput'
                if (buff % 2 == 0) {
                    System.out.println("KONTOLODON (buff is even)");
                } else if (buff % 3 == 0) { // This condition will only be true if buff is odd AND divisible by 3
                    System.out.println("MEMLEAK ANYWAY!!! (buff is odd and divisible by 3)");
                } else {
                    System.out.println("DUAR MEMEW (buff is odd and not divisible by 3)");
                }
                buff++;
            }
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}