import java.io.*;
import java.util.Arrays;

//import java.util.Scanner;
/*
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.BufferedReader;
*/

public class Main {
    public static void main(String[] args) {
/*        try {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("test : ");
            String input = bfr.readLine();

            System.out.println(input);
        } catch (IOException e) {
            System.out.println("Exception is : " + e.getMessage());
        }
 */
        int[][] mat2x2;
        mat2x2 = new int[2][2];

        mat2x2[0][0] = 1;
        mat2x2[0][1] = 2;
        mat2x2[1][0] = 3;
        mat2x2[1][1] = 4;

        System.out.println(Arrays.deepToString(mat2x2));

        String str2d[][] = {{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(str2d));
    }
}
