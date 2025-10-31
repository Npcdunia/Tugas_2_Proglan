/**
 * Kelas menyimpan daftar karakter
 */
public class DataKarakter {
    public Karakter[] karakters;

    /**
     * konstruktor yang menganalsa tiga karakter default
     */
    DataKarakter() {
        karakters = new Karakter[3];
        karakters[0] = new Karakter("Clouds", "Aneluther", 180, 70, 1999, 10090, 15987);
        karakters[1] = new Karakter("Zenith", "Nyxphthora", 289, 90, 2192, 921, 19123);
        karakters[2] = new Karakter("Thea", "Hesyra", 249, 89, 1872, 982, 2982);
    }

    /**
     * Menampilkan daftar karakter ang tersedia
     */
    public void TampilakanListKarakter() {
        System.out.println("=================================");
        System.out.println(" ⚔  SELECT CHARA ⚔ ");
        System.out.println("=================================");
        for (int i = 0; i < karakters.length; i++) {
            System.out.println((i + 1) + ". " + karakters[i].getName() + " (" + karakters[i].getAtribut() + ")");
        }
    }

    /**
     * Mengambil objek karakter bed=rdasarkan indeks
     * @param index
     * @return
     */
    public Karakter getCharacter(int index) {
        if (index >= 1 && index <= karakters.length) {
            return karakters[index - 1];
        } else {
            return null;
        }
    }
}


