# My Profile App — MVVM

Tugas Praktikum Pertemuan 4 — State Management dan MVVM  
**IF25-22017 Pengembangan Aplikasi Mobile**  
Program Studi Teknik Informatika · Institut Teknologi Sumatera

---

## Deskripsi

My Profile App merupakan pengembangan dari aplikasi Profile App pada praktikum sebelumnya. Pada versi ini, aplikasi menerapkan arsitektur **Model-View-ViewModel (MVVM)** untuk mengelola data dan state aplikasi secara lebih terstruktur.

Pengelolaan state menggunakan **StateFlow** sehingga perubahan data dapat langsung diperbarui pada tampilan secara reaktif. Aplikasi juga memiliki fitur **Edit Profile** yang memungkinkan pengguna mengubah informasi profil serta fitur **Dark Mode** untuk mengganti tampilan antara mode terang dan gelap.

Aplikasi dikembangkan menggunakan **Compose Multiplatform** dengan pemisahan antara data, logic, dan tampilan agar kode lebih terorganisir dan mudah dikembangkan.

---

## Screenshot

| Profile View | Edit Profile | Dark Mode |
|---|---|---|
| Profile View | Edit Profile | Dark Mode |

---

## Fitur Aplikasi

- Header profil dengan desain abu-abu, foto profil berbentuk circular, dan tombol edit.
- Menampilkan statistik profil berupa jumlah proyek, IPK, dan semester.
- Tombol **Follow / Following** dengan perubahan state berdasarkan interaksi pengguna.
- Form **Edit Profile** untuk mengubah nama dan bio.
- Fitur **Dark Mode** untuk berpindah antara tema terang dan gelap.
- Informasi kontak berupa email, nomor telepon, lokasi, dan GitHub.
- Daftar keahlian pengguna.
- Pengelolaan state menggunakan `StateFlow`.
- Penggunaan `ProfileViewModel` untuk menangani logic dan event aplikasi.
- Tampilan UI yang mengikuti perubahan state secara reaktif.

---

## Data Profil

| Field | Value |
|---|---|
| Nama | *Hildyah Maretasya Araffad* |
| Title | *Mahasiswa Teknik Informatika* |
| Email | *hildyah.123140151@student.itera.ac.id* |
| Telepon | *+62 822-8069-7530* |
| Lokasi | *Bandar Lampung, Indonesia* |
| Website / GitHub | *github.com/HildyahMaretasyaA* |

---

## Struktur Folder

```text
composeApp/src/commonMain/kotlin/org/example/project/
├── App.kt
├── data/
│   └── ProfileUiState.kt
├── viewmodel/
│   └── ProfileViewModel.kt
└── ui/
    └── ProfileScreen.kt
```

---

## Arsitektur MVVM

Aplikasi menggunakan pola arsitektur **Model-View-ViewModel (MVVM)** untuk memisahkan pengelolaan data, logic aplikasi, dan tampilan.

```text
[ ProfileUiState ]
       ↓
     Model
       ↓
[ ProfileViewModel ]
       ↓  state
       ↑  events
[ ProfileScreen ]
       ↓
      View
```

### Alur Data

- `ProfileUiState` digunakan sebagai data class untuk menyimpan state yang diperlukan oleh aplikasi.
- `ProfileViewModel` menyimpan dan mengelola state menggunakan `MutableStateFlow`.
- `ProfileScreen` mengamati perubahan state menggunakan `collectAsState()`.
- Setiap interaksi pengguna seperti klik tombol atau mengetik pada form dikirimkan ke `ProfileViewModel`.
- Setelah state diperbarui, Compose akan melakukan recompose sehingga tampilan mengikuti data terbaru.

Penerapan MVVM membuat logic aplikasi tidak tercampur langsung dengan komponen UI sehingga struktur kode menjadi lebih terorganisir.

---

## Composable Functions

| Composable | Deskripsi |
|---|---|
| `ProfileHeader` | Menampilkan header profil yang berisi foto, nama, title, bio, dan tombol edit. |
| `EditProfileForm` | Menampilkan form untuk mengubah informasi profil dan menerima state serta callback dari ViewModel. |
| `LabeledTextField` | Komponen input yang dapat digunakan kembali untuk berbagai field pada form. |
| `StatItem` | Menampilkan informasi statistik seperti jumlah proyek, IPK, dan semester. |
| `InfoItem` | Menampilkan informasi kontak berupa ikon, label, dan value. |
| `ProfileCard` | Container berbentuk card untuk mengelompokkan informasi pada halaman profil. |
| `ProfileScreen` | Halaman utama yang mengamati ViewModel dan menyusun seluruh komponen UI. |

---

## State Hoisting pada LabeledTextField

Aplikasi menerapkan konsep **state hoisting** pada komponen `LabeledTextField`. Komponen ini tidak menyimpan state secara mandiri, tetapi menerima nilai dan callback dari parent component.

Alur state:

```text
ProfileScreen
    └── EditProfileForm(
            editName     = uiState.editName,
            onNameChange = { viewModel.onEditNameChange(it) }
        )
            └── LabeledTextField(
                    value         = editName,
                    onValueChange = onNameChange
                )
```

`LabeledTextField` hanya bertugas menampilkan input dan meneruskan perubahan nilai kepada parent. Pengelolaan state tetap dilakukan oleh `ProfileViewModel`.

Dengan konsep ini, komponen UI menjadi lebih sederhana, reusable, dan mudah dikontrol.

---

## Event Handler di ViewModel

| Fungsi | Aksi |
|---|---|
| `toggleFollow()` | Mengubah status Follow menjadi Following atau sebaliknya. |
| `toggleDarkMode()` | Mengubah tema aplikasi antara mode terang dan gelap. |
| `enterEditMode()` | Membuka form edit dan menyalin data profil saat ini ke field edit. |
| `cancelEdit()` | Menutup form edit dan membatalkan perubahan yang belum disimpan. |
| `onEditNameChange(text)` | Memperbarui nilai nama sementara ketika pengguna mengetik. |
| `onEditBioChange(text)` | Memperbarui nilai bio sementara ketika pengguna mengetik. |
| `saveProfile()` | Menyimpan perubahan nama dan bio ke state utama aplikasi. |

---

## Tema Warna

Aplikasi menyediakan dua pilihan tampilan, yaitu **Light Mode** dan **Dark Mode**.

| Elemen | Light Mode | Dark Mode |
|---|---|---|
| Background | `#F5F5F5` | `#121212` |
| Surface / Card | `#FFFFFF` | `#1E1E1E` |
| Header Atas | `#8D8D8D` | `#2C2C2C` |
| Header Bawah | `#5A5A5A` | `#1A1A1A` |
| Teks Utama | `#212121` | `#E0E0E0` |
| Teks Sekunder | `#757575` | `#9E9E9E` |

Pengguna dapat mengubah tema melalui switch **Dark Mode** yang tersedia pada halaman profil.

---

## Cara Menjalankan

### Desktop (JVM)

Untuk menjalankan aplikasi pada target Desktop, gunakan perintah:

```bash
./gradlew :composeApp:run
```

### Android

Aplikasi Android dapat dijalankan melalui Android Studio dengan memilih emulator atau perangkat Android yang sudah terhubung.

Untuk menjalankan melalui Terminal Windows:

```powershell
.\gradlew.bat installDebug
```

Pastikan Android SDK serta emulator atau perangkat Android sudah tersedia dan terdeteksi.

---

## Dependency Tambahan

Aplikasi menggunakan **Material Icons Extended** untuk menyediakan ikon tambahan yang digunakan pada beberapa bagian tampilan.

Dependency ditambahkan pada file `composeApp/build.gradle.kts` di bagian `commonMain.dependencies`:

```kotlin
implementation(compose.materialIconsExtended)
```

---

## Catatan Teknis

Karena aplikasi menggunakan **Compose Multiplatform** dan dapat dijalankan pada target Desktop (JVM), penggunaan `viewModel()` dari Compose Android tidak digunakan.

Sebagai gantinya, instance `ProfileViewModel` dibuat menggunakan `remember`:

```kotlin
fun ProfileScreen(
    viewModel: ProfileViewModel = remember {
        ProfileViewModel()
    }
)
```

Pendekatan ini digunakan untuk mempertahankan instance ViewModel selama lifecycle composable pada target Desktop.

---

## Teknologi yang Digunakan

- Kotlin
- Compose Multiplatform
- Jetpack Compose
- StateFlow
- MVVM Architecture
- Material Icons
- Gradle
- Android Studio

---

## Penulis

| Informasi | Detail |
|---|---|
| **Nama** | *Hildyah Maretasya Araffad* |
| **NIM** | *123140151* |
| **Kelas** | IF25-22017 |
| **Program Studi** | Teknik Informatika |
| **Institusi** | Institut Teknologi Sumatera |

---

**Tugas Praktikum 4 · State Management dan MVVM · Tahun Akademik Genap 2025/2026**