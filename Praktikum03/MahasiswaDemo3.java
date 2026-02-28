package Praktikum03;

public class MahasiswaDemo3 {
    public static void main(String[] args) {
        Mahasiswa3[] arrayOfMahasiswa3 = new Mahasiswa3[3];
        arrayOfMahasiswa3[0] = new Mahasiswa3();
        arrayOfMahasiswa3[0].nim = "244107060033";
        arrayOfMahasiswa3[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa3[0].kelas = "SIB-1E";
        arrayOfMahasiswa3[0].ipk = (float) 3.75;

        arrayOfMahasiswa3[1] = new Mahasiswa3();
        arrayOfMahasiswa3[1].nim = "2341720172";
        arrayOfMahasiswa3[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa3[1].kelas = "TI-2A";
        arrayOfMahasiswa3[1].ipk = (float) 3.36;

        arrayOfMahasiswa3[2] = new Mahasiswa3();
        arrayOfMahasiswa3[2].nim = "244107023006";
        arrayOfMahasiswa3[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa3[2].kelas = "TI - 2E";
        arrayOfMahasiswa3[2].ipk = (float) 3.80;

        System.out.println("NIM     : " + arrayOfMahasiswa3[0].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa3[0].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa3[0].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa3[0].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa3[1].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa3[1].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa3[1].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa3[1].ipk);
        System.out.println("-----------------------------------------");
        System.out.println("NIM     : " + arrayOfMahasiswa3[2].nim);
        System.out.println("Nama    : " + arrayOfMahasiswa3[2].nama);
        System.out.println("Kelas   : " + arrayOfMahasiswa3[2].kelas);
        System.out.println("IPK     : " + arrayOfMahasiswa3[2].ipk);
        System.out.println("-----------------------------------------");
    }
}

