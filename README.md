
<!-- ## [Latihan Praktikum](#latihan-praktikum)  \  [Daftar_Percobaan](#daftar_percobaan)   -->

## [Daftar_Percobaan](#daftar_percobaan)  


<!-- # Latihan Praktikum
### Soal :  

---  
  
### Jawaban

--- -->


# Daftar_Percobaan
- [**Praktikum 1**](#praktikum_1)   
   - [Pertanyaan Praktikum 1](#pertanyaan-praktikum-1)   
   - [Jawaban Praktikum 1](#jawaban-praktikum-1)   


---

## Praktikum_1
[**StackTugasMahasiswa07.java (Commit Awal | 4ac438f)**](https://github.com/okeokke/asd_job9/commit/4ac438f8d91f58ebe9f659021c48a0b1033be2a5#diff-6e93542f79ff3ba7f4dbfdca031d0b42c01c7c436be5eb281bbf6a4336235ac2)  
[**Mahasiswa07.java (Commit Awal | 4ac438f)**](https://github.com/okeokke/asd_job9/commit/4ac438f8d91f58ebe9f659021c48a0b1033be2a5#diff-d2bcd41f805db7994b82414441221155108e43257e5888ae1ebd27c748ff5b0a)  
[**MahasiswaDemo07.java (Commit Awal | 4ac438f)**](https://github.com/okeokke/asd_job9/commit/4ac438f8d91f58ebe9f659021c48a0b1033be2a5#diff-4d77450899a88701e1ddadab765334cd45d15b91ae18210407213b66e1a5ccaa)  

Screenshot output Praktikum 1 :   
![alt text](Out_P1.png)

[Kembali ke #Daftar_Percobaan](#daftar_percobaan)

### Pertanyaan Praktikum 1
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut
dihapus, apa dampaknya?
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga
pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi
lihat tugas terbawah!
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat
ini, serta tambahkan operasi menunya!
6. Commit dan push kode program ke Github

[Kembali ke #Daftar_Percobaan](#daftar_percobaan)


### Jawaban Praktikum 1
1. [**MahasiswaDemo07.java (Commit 1e2f1f3)**](https://github.com/okeokke/asd_job9/commit/1e2f1f334ca4917965235b98a5a2d2895a368a41#diff-4d77450899a88701e1ddadab765334cd45d15b91ae18210407213b66e1a5ccaa)   
```java
//Sebelum
Mahasiswa07 mhs = new Mahasiswa07(nama, nim, kelas);

//Sesudah (Menyesuaikan urutan pada Class Mahasiswa07)
Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas);
```
Output : 
![](Out_P1_New.png)
2. pada file [**MahasiswaDemo07.java Line 6**](https://github.com/okeokke/asd_job9/blob/98e9c83a5a1544ea4f99cbe0c8b5a9c25b0e9b88/MahasiswaDemo07.java#L6)
```java 
StackTugasMahasiswa07 stack = new StackTugasMahasiswa07(5);
```
3. untuk mencegah error overflow pada implementasi Stack dengan ukuran tetap (array-based stack). Dampaknya bisa Error saat runtime, ketika stack sudah penuh (top == maxSize-1), perintah top++ akan membuat top bernilai maxSize, kemudian arr[top] = data akan mencoba mengakses arr[maxSize] yang menyebabkan Index Out of Bounds. Untuk di bahasa pemrograman seperti C/C++ bisa menyebabkan crash.
4. 5. 6.  [**MahasiswaDemo07.java**](MahasiswaDemo07.java)
|| [**StackTugasMahasiswa07.java**](StackTugasMahasiswa07.java)  
Demo Output: 
![](Out_P1_Mod.png)


[Kembali ke #Daftar_Percobaan](#daftar_percobaan)
  
---
