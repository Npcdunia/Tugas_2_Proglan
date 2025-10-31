## ⚔️ Program Stat Karakter

### 📘 Deskripsi

Program ini merupakan aplikasi **Java sederhana** yang menampilkan daftar karakter dan menampilkan detail statistik setiap karakter yang dipilih pengguna.
Setiap karakter memiliki atribut seperti:

* **Nama**
* **Atribut elemen**
* **HP (Health Point)**
* **ATK (Attack)**
* **DEF (Defense)**
* **CR (Critical Rate)**
* **CDM (Critical Damage)**

Program ini dibuat untuk memenuhi **Tugas 2 & 3 Pemrograman Berorientasi Objek (PBO)**, dengan tambahan dokumentasi Javadoc dan pengelolaan pengembangan menggunakan **Git dan GitHub**.

---

### 🧩 Fitur Utama

* Menampilkan **daftar karakter** yang tersedia.
* Memungkinkan pengguna untuk **memilih karakter**.
* Menampilkan **statistik lengkap** karakter terpilih.
* Implementasi **interface** `TampilkanStat`.
* Implementasi **OOP (Class, Method, Atribut, dan Enkapsulasi)**.
* Menggunakan **Javadoc** untuk dokumentasi kode.

---

### 🧠 Struktur Kelas

```
├── Main.java           → Program utama (menjalankan menu & input)
├── Karakter.java       → Class yang menyimpan data dan stat karakter
├── DataKarakter.java   → Class yang menyimpan list karakter
└── TampilkanStat.java  → Interface untuk menampilkan info karakter
```

---

### 🧮 Contoh Output

```
=================================
 ⚔  SELECT CHARA ⚔ 
=================================
1. Clouds (Aneluther)
2. Zenith (Nyxphthora)
3. Thea (Hesyra)

Pilih karakter (1-3): 2

=================================
      ⚔  STAT CHARA ⚔
=================================
Nama Karakter   : Zenith
Atribut         : Nyxphthora
HP              : 19123
ATK             : 2192
DEF             : 921
Crit.Rate       : 90.0%
Crit.DMG        : 289.0%
```

---

### 🧰 Cara Menjalankan Program

1. Pastikan sudah menginstal **Java JDK 17+**.
2. Simpan semua file (`Main.java`, `Karakter.java`, `DataKarakter.java`, `TampilkanStat.java`) dalam satu folder.
3. Buka terminal pada folder tersebut dan jalankan:

   ```bash
   javac Main.java
   java Main
   ```

---

### 🧑‍💻 Pengelolaan Git

Program ini dikelola menggunakan **Git dan GitHub** dengan branch pengembangan:

| Branch         | Deskripsi                                                                       |
| -------------- | ------------------------------------------------------------------------------- |
| `main`         | Branch utama berisi versi stabil program                                        |
| `fitur-damage` | Branch pengembangan berisi fitur tambahan (contoh: perhitungan damage maksimum) |

#### Contoh Perintah Git:

```bash
git init
git add .
git commit -m "Initial commit - Program Stat Karakter"
git branch fitur-damage
git checkout fitur-damage
# Tambahkan fitur baru
git add .
git commit -m "Menambahkan fitur hitung damage maksimum"
git checkout main
git merge fitur-damage
git push origin main
```

---

### 📄 Lisensi

Proyek ini dibuat untuk keperluan pembelajaran dan tugas akademik.
Diperbolehkan untuk digunakan atau dimodifikasi dengan mencantumkan sumber asal.

---
