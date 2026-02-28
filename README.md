# JOBSHEET 3

# PERCOBAAN 

## - Percobaan 1 : Membuat Array dari Object, Mengisi dan Menampilkan

## - Percobaan 1 : Verifikasi Hasil Percobaan 

![Verifikasi1](./Verifikasi1.png)

_Pertanyaan:_

1.  Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method? Jelaskan!
2.  Apa yang dilakukan oleh kode program berikut?
    ```java
        Mahasiswa3[] arrayOfMahasiswa3 = new Mahasiswa3[3];
    ```
3.  Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?
    ```java
        arrayOfMahasiswa3[0] = new Mahasiswa3();
    ```
4.  Apa yang dilakukan oleh kode program berikut?
    ```java
        arrayOfMahasiswa3[0] = new Mahasiswa3();
        arrayOfMahasiswa3[0].nim = "244107060033";
        arrayOfMahasiswa3[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa3[0].kelas = "SIB-1E";
        arrayOfMahasiswa3[0].ipk = (float) 3.75;
    ```
5.  Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

_Jawaban:_

1.  Class yang akan dibuat array of object tidak harus punya method. Cukup punya class yang bisa dibuat objeknya (bida di-new) itu sudah cukup.
    - Pada kode : 
        - nim, nama, kelas, ipk : atribut
        - main() : method
        - Class Mahasiswa3 hanya punya atribut, tidak punya method, tapi tetap bisa dibuat array of object
    Jadi, tidak wajib ada method. Atribut saja sudah cukup untuk dibuat array of object