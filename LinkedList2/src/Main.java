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
               System.out.println("\n--- Menu ---");
               System.out.println("1. Buat Node Pertama");
               System.out.println("2. Sisipkan Node Baru");
               System.out.println("3. Cari Node Berdasarkan Nilai");
               System.out.println("4. Tampilkan Semua Linked List");
               System.out.println("5. Menghapus Linked List per-node");
               System.out.println("6. Menghapus semua node");
               System.out.println("7. Keluar");
               System.out.print("Pilih mode: ");

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
                        System.out.print("Mencari sebuah lokasi node : ");
                        int searching = Integer.parseInt(bufferedReader.readLine().trim());
                        singlyLinkedList.searchSinglyLinkedList(searching);
                        break;
                   case 4:
                       System.out.print("Menampilan semua linked list : ");
                       singlyLinkedList.traverseSinglyLinkedList();
                       break;
                   case 5:
                       System.out.print("Mencari sebuah lokasi node yang di hapus : ");
                       int delete = Integer.parseInt(bufferedReader.readLine().trim());
                       singlyLinkedList.deletion(delete);
                       break;
                   case 6:
                       System.out.print("Menghapus semua node.");
                       singlyLinkedList.deleteAll();
                       break;
                   case 7:
                       System.out.println("Keluar dari program");
                       options = 'N';
                       continue;
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
