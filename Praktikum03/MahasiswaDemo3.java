package Praktikum03;
import java.util.Scanner;

public class MahasiswaDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa3[] arrayOfMahasiswa3 = new Mahasiswa3[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa3[i] = new Mahasiswa3();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa3[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa3[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa3[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa3[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa3[i].cetakInfo();
        sc.close();
        }
    }
}