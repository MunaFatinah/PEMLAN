Penjelasan Program Shift Kerja Tugas Tujuh 

Program ini memiliki tujuan untuk membantu menentukan shift kerja berdasarkan input hari dan jam masuk.  
Program akan meminta input hari dan jam masuk dari pengguna, lalu memvalidasi apakah jam masuk sesuai dengan shift yang berlaku yakni

- Shift pagi: jam 6 - 12 (hari Senin, Rabu, Jumat)  
- Shift siang: jam 13 - 18 (hari Selasa, Kamis)  
- Hari Sabtu dan Minggu adalah hari libur

Jika input hari tidak valid atau jam masuk di luar rentang di atas, program akan memberikan pesan kesalahan dengan detail melalui exception.

Exception yang digunakan adalah 
- NumberFormatException
Digunakan untuk menangani kesalahan input saat pengguna memasukkan jam masuk yang bukan angka seperti misalnya huruf atau simbol.

- IllegalArgumentException
Digunakan untuk menangani kesalahan input yang berkaitan dengan nilai yang tidak sesuai aturan program. 
Misalnya hari yang tidak valid atau jam masuk yang tidak sesuai dengan shift yang berlaku.
