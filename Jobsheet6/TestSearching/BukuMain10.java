package Jobsheet6.TestSearching;

import java.util.Scanner;

public class BukuMain10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
    
        PencarianBuku10 data = new PencarianBuku10();
        int jmlBuku = 5;
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku terkecil: ");
        for (int i = 0; i < jmlBuku; i++) {
            System.out.println("------------------------------------------------------------------");
            System.out.print("Kode buku \t: ");
            String kodeBuku = s.next();
            System.out.print("Judul buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku10 m = new Buku10(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa: ");
        data.tampil();

        System.out.println("_________________________________________________");
        System.out.println("_________________________________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode Buku: ");
        String cari = s.next();
        System.out.println("Menggunakan sequential search");
        // int posisi = data.findSeqSearch(cari);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);

        Buku10 dataBuku = data.findSeqSearchString(cari);
        dataBuku.tampilDataBuku();

        System.out.println("===============================================");
        System.out.println("Menggunakan binary search");

        // posisi = data.findBinarySearch(cari, 0, jmlBuku-1);
        // data.tampilPosisi(cari, posisi);
        // data.tampilData(cari, posisi);

        dataBuku = data.findBinarySearch(cari, 0, jmlBuku-1);
        dataBuku.tampilDataBuku();
    }   
}
