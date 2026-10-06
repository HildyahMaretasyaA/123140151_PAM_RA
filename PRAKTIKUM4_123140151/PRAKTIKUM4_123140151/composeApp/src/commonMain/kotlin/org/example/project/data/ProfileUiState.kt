package org.example.project.data

data class ProfileUiState(
    val name: String = "Hildyah Maretasya Araffad",
    val title: String = "Mahasiswa Teknik Informatika",
    val bio: String =  "Saya merupakan mahasiswa Program Studi Teknik Informatika di Institut Teknologi Sumatera (ITERA) yang memiliki ketertarikan pada bidang Data Science dan Artificial Intelligence (AI). Saya aktif mengikuti kegiatan perkuliahan serta mendalami pengolahan dan analisis data, machine learning, dan penerapan kecerdasan buatan untuk mengembangkan solusi teknologi yang inovatif dan bermanfaat",
    val email: String = "hildyah.123140151@student.itera.ac.id",
    val phone: String = "+62 822-8069-7530",
    val location: String = "Bandar Lampung, Indonesia",
    val website: String = "github.com/HildyahMaretasyaA",

    // State UI tambahan
    val isFollowing: Boolean = false,
    val isDarkMode: Boolean = false,
    val isEditMode: Boolean = false,

    // State sementara saat edit (sebelum di-save)
    val editName: String = "",
    val editBio: String = ""
)