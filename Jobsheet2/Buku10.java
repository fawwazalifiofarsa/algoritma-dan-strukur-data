package Jobsheet2;

public class Buku10 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku10(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0 && stok > jml) {
            stok -= jml;
        } else {
            System.out.println("Stock tidak cukup");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        return jml * harga;
    }

    int hitungDiskon(int hargaTotal) {
        int diskon;
        if (hargaTotal > 150000) {
            diskon = (int) (hargaTotal * 0.12);
        } else if (hargaTotal >= 75000) {
            diskon = (int) (hargaTotal * 0.05);
        } else { 
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar(int hargaTotal, int diskon) {
        return hargaTotal - diskon;
    }
}
