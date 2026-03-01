package Praktikum03;
import java.util.Scanner;

public class MatakuliahDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah Matakuliah : ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah3[] arrayOfMatakuliah3 = new Matakuliah3[jumlah];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("SKS           : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam    : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------------");

            arrayOfMatakuliah3[i] = new Matakuliah3();
            arrayOfMatakuliah3[i].tambahData(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah3[i].cetakInfo();
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.println("Kode        : "+ arrayOfMatakuliah3[i].kode);
            System.out.println("Nama        : "+ arrayOfMatakuliah3[i].nama);
            System.out.println("SKS         : "+ arrayOfMatakuliah3[i].sks);
            System.out.println("Jumlah Jam  : "+ arrayOfMatakuliah3[i].jumlahJam);
            System.out.println("-----------------------------------------");           
        }
        sc.close();
    }
}
