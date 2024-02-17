import java.util.Scanner;
public class Fungsi {
    
    public static final int[][] stock = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9},
    };

    public static final double[] hargaBunga = {75000, 50000, 60000, 10000};

    public static final String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Data Stock Bunga:");
        tampilkanDataStock();

        int[] pendapatanCabang = hitungPendapatan();

        System.out.println("\nPendapatan Setiap Cabang:");
        for (int i = 0; i < pendapatanCabang.length; i++) {
            System.out.println("Cabang " + (i + 1) + ": Rp " + pendapatanCabang[i]);
        }

        System.out.println("\nPengurangan Stok Bunga:");
        for (int i = 0; i < namaBunga.length; i++) {
            System.out.print(namaBunga[i] + ": ");
            int penguranganStok = scanner.nextInt();
            stock[3][i] -= penguranganStok;
        }

        System.out.println("\nStok Bunga Setelah Pengurangan:");
        tampilkanDataStock();
    }

    public static void tampilkanDataStock() {
        // Menampilkan tabel
        System.out.printf("+%-16s+%-11s+%-11s+%-11s+%-11s+%n", "----------------", "-----------", "-----------", "-----------", "-----------");
        System.out.printf(
            "| %-15s| %-10s| %-10s| %-10s| %-10s| %n",
            "Taman", "Aglonema", "Keadi", "Alocasia", "Mawar");
        System.out.printf("+%-16s+%-11s+%-11s+%-11s+%-11s+%n", "----------------", "-----------", "-----------", "-----------", "-----------");
        for (int i = 0; i < stock.length; i++) {
            System.out.printf("| %-15s| %-10s| %-10s| %-10s| %-10s|%n", "RoyalGarden "+(i+1), stock[i][0], stock[i][1], stock[i][2], stock[i][3]);
        }
        System.out.printf("+%-16s+%-11s+%-11s+%-11s+%-11s+%n", "----------------", "-----------", "-----------", "-----------", "-----------");
    }
    
    public static int[] hitungPendapatan() {
        int[] pendapatanCabang = new int[stock.length];
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                pendapatanCabang[i] += stock[i][j] * hargaBunga[j];
            }
        }
        return pendapatanCabang;
    }
}
