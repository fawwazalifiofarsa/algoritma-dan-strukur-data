package Kuis1_Fawwaz;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        AlatMusik10[] arrayAlatMusik10 = new AlatMusik10[5];

        for (int i = 0; i < arrayAlatMusik10.length; i++) {
            Scanner input10 = new Scanner(System.in);
            String nama, merk, kategori;
            int stok, jumlah;
            System.out.println("Input data alat musik ke-" + i);
            System.out.print("Nama: ");
            nama = input10.nextLine();
            System.out.print("Merk: ");
            merk = input10.nextLine();
            System.out.print("Kategori: ");
            kategori = input10.nextLine();
            System.out.print("Stok: ");
            stok = input10.nextInt();
            System.out.print("Jumlah: ");
            jumlah = input10.nextInt();
            arrayAlatMusik10[i] = new AlatMusik10(nama, merk, kategori, stok, jumlah);
        }

        System.out.println("\nMethod tampil()");
        for (int i = 0; i < arrayAlatMusik10.length; i++) {
            System.out.println("Data alat musik ke-" + i);
            arrayAlatMusik10[i].tampil10();
        }

        System.out.println("\nMethod hitungSisa()");
        for (int i = 0; i < arrayAlatMusik10.length; i++) {
            System.out.println("Sisa alat musik ke-" + i + ": " + arrayAlatMusik10[i].hitungSisa10());
        }

        System.out.println("\nMethod cariAlatMusikTidakLaku()");
        Scanner input10 = new Scanner(System.in);
        System.out.print("Input jumlah penjualan: ");
        int jumlah = input10.nextInt();
        for (int i = 0; i < arrayAlatMusik10.length; i++) {
            for (int j = i + 1; j < arrayAlatMusik10.length; j++) {
                if (arrayAlatMusik10[j].jumlah10 > arrayAlatMusik10[i].jumlah10) {
                    AlatMusik10 tempArray = arrayAlatMusik10[i];
                    arrayAlatMusik10[i] = arrayAlatMusik10[j];
                    arrayAlatMusik10[j] = tempArray;
                }
            }
        }
        arrayAlatMusik10[4].cariAlatMusikTidakLaku10(jumlah);

        System.out.println("\nMethod daftarAlatMusik()");
        for (int i = 0; i < arrayAlatMusik10.length; i++) {
            for (int j = i + 1; j < arrayAlatMusik10.length; j++) {
                if (arrayAlatMusik10[j].stok10 > arrayAlatMusik10[i].stok10) {
                    AlatMusik10 tempArray = arrayAlatMusik10[i];
                    arrayAlatMusik10[i] = arrayAlatMusik10[j];
                    arrayAlatMusik10[j] = tempArray;
                }
            }
            arrayAlatMusik10[i].daftarAlatMusik();
        }
    }
}
