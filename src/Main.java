import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Kelas utama menjalankan program pemilihan karakter
 * program menampilkan daftar karakter dan menampilkan detail statistik
 * Karakter yang dipilih oleh pengguna
 */
public class Main {
    /**
     * Method utama
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataKarakter database = new DataKarakter();
        System.out.println("==========================");

        int pilihan = getPilihan(database, input);

        System.out.println("\n=================================");
        System.out.println("      ⚔  STAT CHARA ⚔");
        System.out.println("=================================");

        if (database.getCharacter(pilihan) != null) {
            database.getCharacter(pilihan).displayinfo();
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }

    /**
     * Menampilkan daftar karakter dan meminta input dari pengguna
     * @param database
     * @param input
     * @return
     */
    private static int getPilihan(DataKarakter database, Scanner input) {
        database.TampilakanListKarakter();

        System.out.print("\nPilih karakter (1-3): ");
        int pilihan = input.nextInt();
        return pilihan;
    }
    
}
