# News Feed Simulator
---
## Identitas Pengembang

- **Nama:** Hildyah Maretasya Araffad
- **NIM:** 123140151
- **Kelas:** RA
- **Mata Kuliah:** Pengembangan Aplikasi Mobile
---
## Deskripsi Proyek

News Feed Simulator merupakan aplikasi simulasi berita yang menampilkan informasi secara dinamis menggunakan Kotlin dan Compose Multiplatform. Aplikasi ini dirancang dengan menerapkan pola arsitektur MVVM (Model-View-ViewModel) untuk memisahkan pengelolaan data, logika aplikasi, dan tampilan antarmuka sehingga struktur kode lebih terorganisasi.

Pengembangan aplikasi ini bertujuan untuk menerapkan konsep pemrograman reaktif, pengelolaan state, serta pemrosesan data secara asynchronous. Proyek ini dibuat sebagai bagian dari penyelesaian tugas mata kuliah **Pengembangan Aplikasi Mobile – Kelas RA**.

## Implementasi Komponen dan Kriteria Penilaian

### 1. Pengelolaan Data Menggunakan Flow

**Lokasi:** `data/NewsRepository.kt`

Komponen Flow digunakan untuk menghasilkan aliran data berita secara berkelanjutan. Melalui fungsi `flow { ... }`, aplikasi mensimulasikan kemunculan berita baru dan mengirimkannya menggunakan `emit()`. Data tersebut diperbarui secara berkala setiap dua detik sehingga pengguna dapat melihat perubahan informasi secara langsung.

### 2. Penerapan Flow Operators

**Lokasi:** `ui/NewsFeedScreen.kt` dan `presentation/NewsFeedViewModel.kt`

Beberapa operator digunakan untuk mengolah aliran data sebelum ditampilkan kepada pengguna, yaitu:

- **`onEach`**: Menjalankan proses tambahan setiap kali data berita diterima. Berita yang masuk kemudian ditambahkan ke dalam daftar state pada ViewModel.
- **`filter`**: Memilih berita berdasarkan kategori yang ditentukan melalui menu filter, seperti Tech, Sports, Business, dan Entertainment.
- **`map`**: Mengubah data berita ke dalam format yang diperlukan oleh antarmuka, termasuk menambahkan informasi kategori pada judul berita.

### 3. Pengelolaan State dengan StateFlow

**Lokasi:** `presentation/NewsFeedViewModel.kt`

State aplikasi dikelola menggunakan `MutableStateFlow` dan diekspos melalui `asStateFlow()`. Pendekatan ini memungkinkan perubahan data diamati oleh antarmuka secara reaktif, sekaligus membatasi akses langsung terhadap state yang dikelola ViewModel.

Data yang disimpan meliputi:

- **`readCount`**: Mencatat jumlah berita yang telah dibuka atau dibaca oleh pengguna.
- **`selectedCategory`**: Menyimpan kategori berita yang sedang dipilih.
- **`allNews`**: Menampung kumpulan berita yang diterima dari repository.

### 4. Pemanfaatan Coroutines

**Lokasi:** `presentation/NewsFeedViewModel.kt`

Kotlin Coroutines digunakan untuk menjalankan proses asynchronous melalui `scope.launch`. Pada bagian pengambilan detail berita, aplikasi memanfaatkan `async(Dispatchers.Default)` untuk menjalankan pekerjaan secara asynchronous, kemudian menggunakan `await()` untuk memperoleh hasilnya.

Dengan pendekatan ini, proses pengolahan data dapat berlangsung tanpa harus memblokir thread utama yang menangani antarmuka pengguna.

### 5. Struktur Kode dan Dokumentasi

**Lokasi:** Seluruh source code proyek.

Kode program disusun ke dalam beberapa package berdasarkan tanggung jawab masing-masing komponen. Pemisahan ini mendukung penerapan prinsip Clean Code dan memudahkan proses pemeliharaan maupun pengembangan aplikasi.

Struktur package yang digunakan terdiri dari:

- **`model`**: Mendefinisikan struktur dan representasi data berita.
- **`data`**: Mengelola sumber data serta proses penyediaan berita melalui repository.
- **`presentation`**: Menangani ViewModel dan state aplikasi.
- **`ui`**: Berisi komponen antarmuka yang dibangun menggunakan Jetpack Compose.

---

## Panduan Menjalankan Aplikasi

Aplikasi ini dikembangkan menggunakan Compose Multiplatform dan menyediakan target desktop. Berikut tahapan untuk menjalankannya:

1. **Persiapkan IDE**  
   Gunakan Android Studio atau IntelliJ IDEA yang mendukung proyek Kotlin dan Compose Multiplatform.

2. **Buka proyek**  
   Pilih menu `File > Open...`, kemudian tentukan direktori utama proyek News Feed Simulator.

3. **Tunggu proses Gradle Sync**  
   Biarkan IDE menyelesaikan sinkronisasi Gradle, termasuk proses pemuatan dependensi yang dibutuhkan oleh Kotlin, Coroutines, dan Compose.

4. **Jalankan program**  
   Setelah proses sinkronisasi selesai, jalankan konfigurasi aplikasi melalui tombol Run atau gunakan shortcut `Shift + F10`.

5. **Uji fitur aplikasi**  
   Setelah jendela aplikasi tampil, amati penambahan berita secara otomatis dalam interval dua detik. Pengguna juga dapat memilih kategori melalui menu filter dan membuka kartu berita untuk melihat perubahan jumlah berita yang telah dibaca.

---

## Screenshot Aplikasi
<img width="587" height="440" alt="image" src="https://github.com/user-attachments/assets/594946c5-efb9-4c1c-9ae7-f6f19a43cead" />
<img width="589" height="439" alt="image" src="https://github.com/user-attachments/assets/9cd6e18a-50de-44fc-89c7-5aa6108522a0" />

