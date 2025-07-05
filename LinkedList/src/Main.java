import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));

        try {
            char pilihan;
            do {
                System.out.print("Pilih mode (1 = buat awal, 2 = sisipkan node): ");
                int step = Integer.parseInt(buffRead.readLine().trim());

                switch (step) {
                    case 1:
                        System.out.print("Masukkan nilai untuk node pertama: ");
                        int firstValue = Integer.parseInt(buffRead.readLine().trim());
                        list.createSinglyLinkedList(firstValue);
                        break;

                    case 2:
                        System.out.print("Masukkan nilai dan lokasi (contoh: 7 0): ");
                        String[] parts = buffRead.readLine().trim().split("\\s+");
                        if (parts.length != 2) {
                            System.out.println("Input tidak valid. Harus 2 angka dipisahkan spasi.");
                            break;
                        }
                        int value = Integer.parseInt(parts[0]);
                        int location = Integer.parseInt(parts[1]);
                        list.insertInLinkedList(value, location);
                        break;

                    default:
                        System.out.println("Langkah tidak dikenali (gunakan 1 atau 2).");
                        break;
                }

                System.out.print("Apakah ingin melanjutkan? Tekan y/Y untuk lanjut: ");
                String in = buffRead.readLine().trim();
                pilihan = in.isEmpty() ? 'N' : in.charAt(0);

            } while (pilihan == 'y' || pilihan == 'Y');

            list.display();
       } catch (IOException | NumberFormatException e) {
           throw new RuntimeException(e);
       }
    }
}
