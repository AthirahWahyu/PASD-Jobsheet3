// import Praktikum03.Dosen3;

public class DataDosen3 {
    // a. Menampilkan semua data dosen 
    public void dataSemuaDosen(Dosen3[] arrayOfDosen) {
        int no = 1;
        for (Dosen3 dsn : arrayOfDosen){
            System.out.println("\nData Dosen ke-" + no);
            dsn.tampilkanData();
            System.out.println("-----------------------------------------");
            no++;
        }
    }
    // b. Jumlah dosen per jenis kelamin 
    public void jumlahDosenPerJenisKelamin(Dosen3[] arrayOfDosen3) {
        int pria = 0;
        int wanita = 0;

        for(Dosen3 dsn : arrayOfDosen3){
            if (dsn.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("\nJumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    // c. Rata - rata usia per jenis kelamin 
    public void rerataUsiaDosenPerJenisKelamin(Dosen3[] arrayOfDosen3) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen3 dsn : arrayOfDosen3) {
            if (dsn.jenisKelamin) {
                totalPria += dsn.usia;
                jumlahPria++;
            } else {
                totalWanita += dsn.usia;
                jumlahWanita++;
            }
        }
        double rataPria = jumlahPria > 0 ? (double) totalPria / jumlahPria : 0;
        double rataWanita = jumlahWanita > 0 ? (double) totalWanita / jumlahWanita : 0 ;

        System.out.println("\nRata - rata Usia Dosen Pria : " + rataPria);
        System.out.println("\nRata - rata Usia Dosen Wanita : " + rataWanita);
    }

    // d. Informasi dosen paling tua
    public void infoDosenPalingTua(Dosen3[] arrayOfDosen3){
        Dosen3 tertua = arrayOfDosen3[0];

        for (Dosen3 dsn : arrayOfDosen3) {
            if (dsn.usia > tertua.usia) {
                tertua = dsn;
            }
        }
        System.out.println("\nDosen Paling Tua : ");
        tertua.tampilkanData();
    }

    // e. Informasi dosen paling muda 
    public void infoDosenPalingMuda(Dosen3[] arrayOfDosen3) {
        Dosen3 termuda = arrayOfDosen3[0];

        for (Dosen3 dsn : arrayOfDosen3){
            if (dsn.usia < termuda.usia) {
                termuda = dsn;
            }
        }
        System.out.println("\nDosen Paling Muda : ");
        termuda.tampilkanData();
    }
}