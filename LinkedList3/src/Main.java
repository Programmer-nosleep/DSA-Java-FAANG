import java.util.Arrays;
import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        CuricularSinglyLinkedList csll = new CuricularSinglyLinkedList();

        try {
            char options = 0;
            do {
                System.out.println("\n--Menu--");
                System.out.println("1. Buat Node Pertama");
                System.out.println("2. Sisipkan Node Baru");
                System.out.println("3. Menampilakn semua node");
                System.out.println("4. Keluar program");
                System.out.print("Pilih mode : ");

                String[] input_parts = bufferedReader.readLine().trim().split("\\s+");
                if (input_parts.length == 0 || !input_parts[0].matches("\\d+")) {
                    System.out.println("input tidak valid. masukan satu angka saja");
                    continue;
                }

                int step = Integer.parseInt(input_parts[0]);
                switch (step) {
                    case 1:
                        System.out.print("Masukan nilai untuk pross node pertama : ");
                        int first = Integer.parseInt(bufferedReader.readLine().trim());
                        csll.create(first);
                        break;
                    case 2:
                        System.out.print("Masukan nilai dan lokasi (contoh : elm 0 index 0) : ");
                        String[] parts = bufferedReader.readLine().trim().split("\\s+");
                        if (parts.length != 2) {
                            System.out.println("input tidak valid. harus memiliki 2 angka di pisahkan space.");
                            break;
                        }
                        int value = Integer.parseInt(parts[0]);
                        int location = Integer.parseInt(parts[0]);
                        csll.insert(value, location);
                    case 3:
                        System.out.print("Menampilkan sama linked list : ");
                        csll.display();
                        break;
                    case 4:
                        System.out.println("Keluar dari program.");
                        options = 'N';
                        continue;
                    default:
                        System.out.println("invalid value.");
                        break;
                }
                System.out.print("Apakah ingin melanjutkan sebuah kode program ini? press y/Y to continue. ");
                String input = bufferedReader.readLine();
                options = input.isEmpty() ? 'N' : input.charAt(0);
            } while (options == 'y' || options == 'Y');

        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}