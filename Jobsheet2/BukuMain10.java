package Jobsheet2;

public class BukuMain10 {
    public static void main(String[] args) {
        // Buku10 bk1 = new Buku10();
        // bk1.judul = "Today Ends Tomorrow Comes";
        // bk1.pengarang = "Denanda Pratiwi";
        // bk1.halaman = 198;
        // bk1.stok = 13;
        // bk1.harga = 71000;

        // bk1.tampilInformasi();
        // bk1.terjual(5);
        // bk1.gantiHarga(60000);
        // bk1.tampilInformasi();

        Buku10 bk2 = new Buku10("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku10 bukuFawwazAlifio = new Buku10("Programming Languages", "Steve Jobs", 86, 23, 40000);
        bukuFawwazAlifio.tampilInformasi();
        int hargaTotal = bukuFawwazAlifio.hitungHargaTotal(5);
        int diskon = bukuFawwazAlifio.hitungDiskon(hargaTotal);
        int hargaBayar = bukuFawwazAlifio.hitungHargaBayar(hargaTotal, diskon);

        System.out.println("Harga total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga bayar: Rp " + hargaBayar);
    }
}
