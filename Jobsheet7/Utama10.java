package Jobsheet7;

import java.util.Scanner;

public class Utama10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang: ");
        int size = scanner.nextInt();
        Gudang10 gudang10 = new Gudang10(size);
        Barang10 barangPertama = new Barang10(21, "Majalah", "Buku");
        gudang10.tambahBarang(barangPertama);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang10 barangBaru = new Barang10(kode, nama, kategori);
                    gudang10.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang10.ambilBarang();
                    break;
                case 3:
                    gudang10.tampilkanBarang();
                    break;
                case 4:
                    gudang10.lihatBarangTeratas();
                    break;
                case 5: 
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
