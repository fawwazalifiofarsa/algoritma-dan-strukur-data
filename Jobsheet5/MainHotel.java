package Jobsheet5;

import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Gets Hotel", "Kota Malang", 360000, (byte) 4);
        Hotel h2 = new Hotel("Atria Hotel", "Kabupaten Malang", 411000, (byte) 5);
        Hotel h3 = new Hotel("The Grand Palace Hotel", "Kota Medan", 325000, (byte) 1);
        Hotel h4 = new Hotel("Riche Herritage Hotel", "Kota Bandung", 484000, (byte) 3);
        Hotel h5 = new Hotel("Ibis Styles", "Kota Bogor", 280000, (byte) 2);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data hotel sebelum sorting");
        list.tampilAll();

        System.out.println("Sort by: ");
        System.out.println("1. Harga");
        System.out.println("2. Bintang");
        System.out.print("Masukkan input: ");
        char opsi = input.next().charAt(0);

        System.out.println("Data hotel setelah sorting dengan Bubble Sort");
        list.bubbleSort(opsi);
        list.tampilAll();

        System.out.println("Data hotel setelah sorting dengan Selection Sort");
        list.selectionSort(opsi);
        list.tampilAll();
    }
}
