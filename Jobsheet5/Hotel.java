package Jobsheet5;

public class Hotel {
    String nama;
    String kota;
    int harga;
    byte bintang;

    Hotel(String n, String k, int h, byte b) {
        this.nama = n;
        this.kota = k;
        this.harga = h;
        this.bintang = b;
    }

    void tampil() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Kota: " + this.kota);
        System.out.println("Harga: " + this.harga);
        System.out.println("Bintang: " + this.bintang);
    }
}