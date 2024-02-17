import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        double nilaiAkhir;
        String keterangan = "";
        String[] nilaiHuruf = { "A", "B+", "B", "C+", "C", "D", "E" };
        String[] Kualifikasi = { "Sangat Baik", "Lebih dari Baik", "Baik", "Lebih dari Cukup", "Cukup", "Kurang", "Gagal" };

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        kuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = input.nextInt();
        if (tugas >= 0 && tugas <= 100
                && kuis >= 0 && kuis <= 100
                && uts >= 0 && uts <= 100
                && uas >= 0 && uas <= 100) {
            nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
                System.out.println("\nNilai Angka: " + nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaiHuruf[0]);
                keterangan = nilaiHuruf[0];
            } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
                System.out.println("\nNilai Angka: " + nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaiHuruf[1]);
                keterangan = nilaiHuruf[1];
            } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
                System.out.println("\nNilai Angka: " + nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaiHuruf[2]);
                keterangan = nilaiHuruf[2];
            } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
                System.out.println("\nNilai Angka: " + nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaiHuruf[3]);
                keterangan = nilaiHuruf[3];
            } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
                System.out.println("\nNilai Angka: " + nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaiHuruf[4]);
                keterangan = nilaiHuruf[4];
            } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
                System.out.println("\nNilai Angka: " + nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaiHuruf[5]);
                keterangan = nilaiHuruf[5];
            } else if (nilaiAkhir <= 39) {
                System.out.println("\nNilai Angka: " + nilaiAkhir);
                System.out.println("Nilai Huruf: " + nilaiHuruf[6]);
                keterangan = nilaiHuruf[6];
            }

            if (keterangan.equals("D") || keterangan.equals("E")) {
                System.out.println("Keterangan: Tidak Lulus");
            } else {
                System.out.println("Keterangan: Lulus");
            }
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
