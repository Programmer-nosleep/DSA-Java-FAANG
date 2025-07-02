import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
   public static void main(String[] arguments) {
      ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30));

      numbers.add(40);
      numbers.add(50);
      numbers.add(2,70);

      System.out.println(numbers);

      ArrayList<String> character = new ArrayList<String>();
      character.add("A");
      character.add("B");
      character.add("C");

//      for (int i = 0; i < character.size(); i++) {
//         String latter = character.get(i);
//         System.out.println(latter);
//      }

      Iterator<String> iterator = character.iterator();
      while(iterator.hasNext()) {
         String letter = iterator.next();
         System.out.println(letter);
      }

      System.out.println(character);
   }
}
