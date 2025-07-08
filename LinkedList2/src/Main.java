import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        try {
           char options = 0;

           do {
               System.out.println("Menu");
               System.out.println("1. Buat Node pertama");
               System.out.println("2. Sisipkan node baru");
               System.out.println("3. Tampilkan isi linked list");
               System.out.print("Pilih mode : ");

               String[] inputParts = bufferedReader.readLine().trim().split("\\s+");
               if (inputParts.length == 0 || !inputParts[0].matches("\\d+")) {
                   System.out.println("Input tidak valid. masukan satu angka saja");
                   continue;
               }
               
               int step = Integer.parseInt(inputParts[0]);
               switch (step) {
                   case 1:
                       System.out.print("Masukan nilai untuk proses node pertama : ");
                       int first = Integer.parseInt(bufferedReader.readLine().trim());
                       singlyLinkedList.create(first);
                      break;
                   case 2:
                       System.out.print("Masukan nilai dan lokasi (contoh :  0 0) : ");
                       String[] parts = bufferedReader.readLine().trim().split("\\s+");
                       if (parts.length != 2) {
                           System.out.println("Input tidak valid, harus memiliki 2 angka di pisahkan space.");
                           break;
                       }
                       int value = Integer.parseInt(parts[0]);
                       int location = Integer.parseInt(parts[1]);
                       singlyLinkedList.insert(value, location);
                       break;
                   case 3:
                       System.out.print("Menampilan semua linked list : ");
                       singlyLinkedList.traverseSinglyLinkedList();
                       break;
                   default:
                       System.out.println("invalid value.");
                       break;
               }

               System.out.print("apakah ingin melanjutkan sebuah kode program ini? press y/Y to continue.");
               String input = bufferedReader.readLine();
               options = input.isEmpty() ? 'N' : input.charAt(0);
           } while (options == 'y' || options == 'Y');

           singlyLinkedList.display();
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
