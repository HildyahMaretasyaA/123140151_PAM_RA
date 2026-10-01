# Tugas Praktikum 1 - Pengembangan Aplikasi Mobile RA

- **Nama**: Hildyah Maretasya Araffad
- **NIM**: 123140151
- **Program Studi**: Teknik Informatika
- **Kampus**: Institut Teknologi Sumatera (ITERA)

## Deskripsi Tugas

Aplikasi pada praktikum ini dibuat menggunakan **Kotlin Multiplatform (KMP)** dan **Compose Multiplatform** berdasarkan template yang telah disediakan.

Modifikasi yang dilakukan meliputi:

1. Melakukan setup development environment menggunakan Android Studio dan Kotlin Multiplatform Plugin.
2. Membuat project Kotlin Multiplatform menggunakan template Compose Multiplatform.
3. Memodifikasi tampilan awal aplikasi dengan:
   - Mengubah teks menjadi **"Halo, Hildyah Maretasya Araffad!"**
   - Menambahkan NIM **123140151** di bawah nama.
   - Menampilkan nama platform yang sedang digunakan.
4. Menjalankan aplikasi pada platform Android atau desktop.
5. Mengunggah hasil pengerjaan ke repository GitHub pribadi.

## Screenshot Aplikasi

Berikut adalah tampilan aplikasi yang telah dijalankan pada Android Emulator.

<img width="166" height="313" alt="Cuplikan layar 2026-09-09 193615" src="https://github.com/user-attachments/assets/e3f01dbf-d0ed-4c81-98c5-057fb26e8b5e" />
<img width="161" height="316" alt="Cuplikan layar 2026-09-09 193642" src="https://github.com/user-attachments/assets/d41f5323-a0b8-4ef3-8978-29e88b272a7b" />

Berikut adalah tampilan aplikasi yang telah dijalankan pada Desktop.
<img width="959" height="503" alt="Cuplikan layar 2026-09-09 190122" src="https://github.com/user-attachments/assets/de8b7352-9ce0-49c8-b1e7-09b9784357c3" />
<img width="959" height="503" alt="Cuplikan layar 2026-09-09 190142" src="https://github.com/user-attachments/assets/08cb0714-e703-4a3b-a0d2-c0f6cc91af38" />

## Teknologi yang Digunakan

- **Bahasa Pemrograman**: Kotlin
- **Framework**: Kotlin Multiplatform (KMP)
- **UI Toolkit**: Compose Multiplatform
- **IDE**: Android Studio
- **Platform**: Android

## Struktur Project

```text
Praktikum1_123140151/
├── androidApp/
├── desktopApp/
├── iosApp/
├── shared/
│   └── src/
│       └── commonMain/
│           └── kotlin/
│               ├── App.kt
│               ├── Greeting.kt
│               ├── GreetingUtil.kt
│               └── Platform.kt
├── gradle/
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── README.md
└── settings.gradle.kts
