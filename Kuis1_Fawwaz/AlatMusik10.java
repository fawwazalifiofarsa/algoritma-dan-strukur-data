package Kuis1_Fawwaz;

public class AlatMusik10 {
    String nama10;
    String merk10;
    String kategori10;
    int stok10;
    int jumlah10;

    public AlatMusik10(String nama, String merk, String kategori, int stok, int jumlah) {
        this.nama10 = nama;
        this.merk10 = merk;
        this.kategori10 = kategori;
        this.stok10 = stok;
        this.jumlah10 = jumlah;
    }

    public void tampil10() {
        System.out.println("Nama: " + nama10);
        System.out.println("Merk: " + merk10);
        System.out.println("Kategori: " + kategori10);
        System.out.println("Stok: " + stok10);
        System.out.println("Jumlah: " + jumlah10);
    }

    public int hitungSisa10() {
        return stok10 - jumlah10;
    }

    public void cariAlatMusikTidakLaku10(int jumlah) {
        if (jumlah >= jumlah10) {
            System.out.println("Nama: " + nama10);
            System.out.println("Merk: " + merk10);
            System.out.println("Kategori: " + kategori10);
            System.out.println("Stok: " + stok10);
            System.out.println("Jumlah: " + jumlah10);
        }
    }

    public void daftarAlatMusik() {
        System.out.println("Nama: " + nama10);
        System.out.println("Merk: " + merk10);
        System.out.println("Kategori: " + kategori10);
        System.out.println("Stok: " + stok10);
        System.out.println("Jumlah: " + jumlah10);
    }
}
