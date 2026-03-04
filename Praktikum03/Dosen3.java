// package Praktikum03;

public class Dosen3 {
    String kode;
    String nama;
    Boolean jenisKelamin; // true = Pria, false = Wanita
    int usia;

    public Dosen3(String kode, String nama, Boolean jenisKelamin, int usia){
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    // Method untuk menampilkan data 
    public void tampilkanData() {
        System.out.println("Kode Dosen      : " + kode);
        System.out.println("Nama Dosen      : " + nama);
        System.out.println("Jenis Kelamin   : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia            : " + usia);
    }
}