package Jobsheet6.TestSearching;

import java.util.ArrayList;
import java.util.List;

public class PencarianBuku10 {
    Buku10 listBk[] = new Buku10[5];
    int idx;

    void tambah(Buku10 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku10 m : listBk) {
            m.tampilDataBuku();
        }
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != 1) {
            System.out.println("Data " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void tampilData(int x, int pos) {
        if (pos != 1) {
            System.out.println("Kode buku \t: " + x);
            System.out.println("Judul buku \t: " + listBk[pos].judulBuku);
            System.out.println("Tahun terbit \t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang \t: " + listBk[pos].pengarang);
            System.out.println("Stock \t\t: " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public Buku10 findSeqSearchString(String cari) {
        Buku10 bukuDitemukan = null;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equalsIgnoreCase(cari)) {
                bukuDitemukan = listBk[i];
                break;
            }
        }
        return bukuDitemukan;
    }

    public Buku10 findBinarySearch(String cari, int left, int right) {
        Buku10 bukuDitemukan = null;
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].kodeBuku)) {
                bukuDitemukan = listBk[mid];
                return bukuDitemukan;
            } else if (Integer.parseInt(listBk[mid].kodeBuku) > Integer.parseInt(cari)) {
                return findBinarySearch(cari, mid + 1, right);
            } else {
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return bukuDitemukan;
    }

    public void bubbleSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j <listBk.length - i - 1; j++) {
                if (Integer.parseInt(listBk[j].kodeBuku) < Integer.parseInt(listBk[j].kodeBuku)) {
                    Buku10 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }
    
    public Buku10 findSeqSearchByJudul(String cari) {
        bubbleSort();
        Buku10 bukuDitemukan = null;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                bukuDitemukan = listBk[i];
                break;
            }
        }
        return bukuDitemukan;
    }

    public Buku10 findBinarySearchByJudul(String cari, int left, int right) {
        bubbleSort();
        Buku10 bukuDitemukan = null;
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equalsIgnoreCase(listBk[mid].judulBuku)) {
                bukuDitemukan = listBk[mid];
                return bukuDitemukan;
            } else if (Integer.parseInt(listBk[mid].judulBuku) > Integer.parseInt(cari)) {
                return findBinarySearch(cari, mid + 1, right);
            } else {
                return findBinarySearch(cari, left, mid - 1);
            }
        }
        return bukuDitemukan;
    }

    public void findAndWarnDuplicateTitles(String cari) {
        int count = 0;
        int firstIndex = -1;
    
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judulBuku.equalsIgnoreCase(cari)) {
                count++;
                if (count == 1) {
                    firstIndex = i;
                }
            }
        }
    
        if (count > 1) {
            System.out.println("Peringatan: Lebih dari satu judul buku dengan judul '" + cari + "' ditemukan!");
            System.out.println("Judul buku ditemukan pada indeks:");
            System.out.println(firstIndex); 
        }
    }
}
