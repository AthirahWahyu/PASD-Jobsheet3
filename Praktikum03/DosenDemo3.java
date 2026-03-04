// package Praktikum03;

import java.util.Scanner;

public class DosenDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen : ");
        int jumlah = input.nextInt();
        input.nextLine(); // Membersihkan buffer

        Dosen3[] arrayOfDosen3 = new Dosen3[jumlah];

        String kode;
        String nama;
        Boolean jenisKelamin;
        int usia;

        // Input data menggunakan FOR 
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i+1));

            System.out.print("Kode                          : ");
            kode = input.nextLine();

            System.out.print("Nama                          : ");
            nama = input.nextLine();

            System.out.print("Jenis Kelamin (Pria / Wanita) : ");
            String jk = input.nextLine();
            jenisKelamin = jk.equalsIgnoreCase("P");

            System.out.print("Usia                          : ");
            usia = input.nextInt();
            input.nextLine();

            arrayOfDosen3[i] = new Dosen3(kode, nama, jenisKelamin, usia);
        }

        // Menampilkan data menggunakan FOREACH
        System.out.println("\n---------- DATA DOSEN ----------");

        int no = 1; // counter manual 
        for (Dosen3 dsn : arrayOfDosen3) {
            System.out.println("\nData Dosen ke-" + no);
            dsn.tampilkanData();
            System.out.println("-----------------------------------------");
            no++;
        }

        // Membuat Object DataDosen3
        DataDosen3 data = new DataDosen3();

        System.out.println("\n---------- DATA SEMUA DOSEN ----------");
        data.dataSemuaDosen(arrayOfDosen3);

        System.out.println("\n---------- JUMLAH DOSEN ----------");
        data.jumlahDosenPerJenisKelamin(arrayOfDosen3);

        System.out.println("\n---------- RATA - RATA USIA ----------");
        data.rerataUsiaDosenPerJenisKelamin(arrayOfDosen3);

        System.out.println("\n---------- DOSEN PALING TUA ----------");
        data.infoDosenPalingTua(arrayOfDosen3);

        System.out.println("\n---------- DOSEN PALING MUDA ----------");
        data.infoDosenPalingMuda(arrayOfDosen3);

        input.close();
    }
}
