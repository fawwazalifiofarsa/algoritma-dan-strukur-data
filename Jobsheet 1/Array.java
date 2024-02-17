import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[8];
        int index = 0;
        int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };
        int totalSks = 0;
        int nilaiMax = 100, nilaiMin = 100;
        int[] nilaiDecrementer = { 20, 7, 8, 5, 10, 11 };
        double[] nilaiSetara = { 4, 3.5, 3, 2.5, 2, 1, 0 };
        String[][] nilaiKonversi = new String[8][2];
        String[] matkul = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        String[] nilaiHuruf = { "A", "B+", "B", "C+", "C", "D", "E" };
        double[] ip = new double[matkul.length];
        double ipk = 0;

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("Masukkan nilai angka untuk %s: ", matkul[i]);
            nilai[i] = input.nextInt();
        }

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] < 0 && nilai[i] > 100) {
                System.out.println("Nilai tidak valid!");
                System.exit(400);
            }
        }
        System.out.println("\nHasil Konversi Nilai\n");
        System.out.printf("%-40s%-15s%-15s%-15s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int j = 0; j < nilai.length; j++) {
            for (int k = 0; k < nilaiSetara.length; k++) {
                if (k != nilaiSetara.length - 1) {
                    nilaiMin -= nilaiDecrementer[index];
                    if (nilai[j] <= nilaiMax && nilai[j] > nilaiMin) {
                        nilaiKonversi[j][0] = nilaiHuruf[k];
                        nilaiKonversi[j][1] = Double.toString(nilaiSetara[k]);
                        nilaiMax = 100;
                        nilaiMin = 100;
                        index = 0;
                        break;
                    } else {
                        nilaiMax -= nilaiDecrementer[index];
                        index++;
                    }
                } else {
                    if (nilai[j] <= nilaiMax) {
                        nilaiKonversi[j][0] = nilaiHuruf[k];
                        nilaiKonversi[j][1] = Double.toString(nilaiSetara[k]);
                        nilaiMax = 100;
                        nilaiMin = 100;
                        index = 0;
                        break;
                    }
                }
            }
            System.out.printf("%-40s%-15s%-15s%-15s%n", matkul[j], nilai[j], nilaiKonversi[j][0], nilaiKonversi[j][1]);
        }
        for (int i = 0; i < matkul.length; i++) {
            ip[i] = Double.parseDouble(nilaiKonversi[i][1]) * sks[i];
            ipk += ip[i];
            totalSks += sks[i];
        }
        System.out.printf("\nIP: %s", String.format("%.2f", (ipk/totalSks)));
    }
}
