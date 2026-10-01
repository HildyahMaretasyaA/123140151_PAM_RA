Praktikum Pertemuan 3 — Compose Multiplatform Basics  
**IF25-22017 Pengembangan Aplikasi Mobile**  
Program Studi Teknik Informatika · Institut Teknologi Sumatera

---

## Deskripsi Aplikasi

My Profile App merupakan aplikasi berbasis multiplatform yang dikembangkan menggunakan Kotlin dan Compose Multiplatform. Aplikasi ini dirancang untuk menampilkan informasi profil pengguna melalui antarmuka yang sederhana dan modern, mencakup identitas diri, deskripsi singkat, statistik akademik, informasi kontak, serta daftar keahlian.

---

## Screenshot Aplikasi

| Tampilan Aplikasi |
|---|
|<img width="134" height="298" alt="hasil" src="https://github.com/user-attachments/assets/e3e62153-a1b4-4892-a5b6-7cb9e568b9e8" />

---

## Fitur Aplikasi

- **Profil Pengguna:** Menampilkan foto profil berbentuk lingkaran, nama, dan informasi singkat.
- **Deskripsi Diri:** Menyediakan bagian biografi yang berisi gambaran umum pengguna.
- **Statistik Akademik:** Menampilkan informasi jumlah proyek, IPK, dan semester.
- **Tombol Follow:** Memungkinkan pengguna mengganti status tombol antara Follow dan Following.
- **Informasi Kontak:** Menampilkan email, nomor telepon, lokasi, serta tautan website atau GitHub.
- **Daftar Keahlian:** Menampilkan bidang keahlian pengguna beserta ikon pendukung.
- **Tampilan Scrollable:** Memungkinkan pengguna menjelajahi seluruh konten pada berbagai platform.

---

## Struktur Fungsi Composable

| Composable | Kegunaan |
|---|---|
| `ProfileHeader` | Menampilkan bagian profil yang berisi avatar, nama, status, dan deskripsi pengguna. |
| `StatItem` | Menyajikan data statistik dalam bentuk komponen yang dapat digunakan kembali. |
| `InfoItem` | Menampilkan informasi dalam format ikon, label, dan nilai. |
| `ProfileCard` | Menjadi wadah untuk mengelompokkan informasi berdasarkan kategori, seperti kontak dan keahlian. |
| `ProfileScreen` | Menyusun seluruh komponen menjadi halaman profil utama. |

---

## Komponen Antarmuka Pengguna

| Komponen | Fungsi |
|---|---|
| `Column` | Mengatur elemen UI secara vertikal. |
| `Row` | Menyusun elemen secara horizontal, termasuk statistik dan tombol Follow. |
| `Box` | Mengatur elemen avatar, ikon, dan latar belakang. |
| `Card` | Membentuk wadah untuk informasi profil dan statistik. |
| `Text` | Menampilkan teks, seperti nama, deskripsi, label, dan angka statistik. |
| `Button` | Menyediakan tombol interaktif untuk fitur Follow. |
| `Icon` | Menampilkan ikon profil dan informasi kontak. |

---

## Teknologi yang Digunakan

- **Kotlin:** Bahasa pemrograman utama dalam pengembangan aplikasi.
- **Compose Multiplatform:** Framework deklaratif untuk membangun antarmuka pada berbagai platform.
- **Material 3:** Digunakan untuk membangun komponen UI dengan desain yang konsisten.
- **Material Icons Extended:** Menyediakan koleksi ikon tambahan untuk mendukung tampilan aplikasi.

---

## Panduan Menjalankan Aplikasi

### 1. Desktop (JVM)

Jalankan perintah berikut melalui terminal pada direktori utama project:

```bash
./gradlew :composeApp:run
```

### 2. Android

1. Buka project menggunakan Android Studio.
2. Tunggu hingga proses Gradle Sync selesai.
3. Pilih konfigurasi aplikasi `composeApp`.
4. Tentukan emulator atau perangkat Android yang akan digunakan.
5. Tekan tombol **Run** untuk menjalankan aplikasi.

---

## Dependency Tambahan

Untuk menggunakan koleksi ikon Material secara lengkap, tambahkan dependency berikut pada bagian `commonMain.dependencies` di file `composeApp/build.gradle.kts`:

```kotlin
implementation(compose.materialIconsExtended)
```

---

## Struktur Direktori Project

```text
composeApp/
└── src/
    └── commonMain/
        └── kotlin/
            └── org/example/project/
                ├── App.kt
                └── ProfileScreen.kt
```

Keterangan:
- `App.kt` merupakan titik awal aplikasi yang memanggil halaman profil.
- `ProfileScreen.kt` berisi implementasi komponen Composable beserta logika antarmuka pengguna.

---

## Identitas Mahasiswa

| Keterangan | Informasi |
|---|---|
| **Nama** | Hildyah Maretasya Araffad |
| **NIM** | 123140151 |
| **Kelas** | Pengembangan Aplikasi Mobile RA |
| **Program Studi** | Teknik Informatika |
| **Institusi** | Institut Teknologi Sumatera |

---

*Tugas Praktikum Pertemuan 3 · Tahun Akademik Genap 2025/2026*
