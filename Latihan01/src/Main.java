import java.util.Arrays;
import java.util.Iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
       try {
          System.out.print("masukan nilai : ");
          String input = bfr.readLine();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
