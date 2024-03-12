package Jobsheet3;

import java.util.Scanner;

public class Latihan1Main {
    public static void main(String[] args) {
        Kerucut[] arrayKerucut = new Kerucut[1];
        Limas[] arrayLimas = new Limas[1];
        Bola[] arrayBola = new Bola[1];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayKerucut.length; i++) {
            arrayKerucut[i] = new Kerucut();
            System.out.println("Kerucut ke-" + (i+1));
            System.out.print("Masukkan radius: ");
            arrayKerucut[i].radius = sc.nextInt();
            System.out.print("Masukkan sisi miring: ");
            arrayKerucut[i].sisiMiring = sc.nextInt();
        }

        for (int i = 0; i < arrayLimas.length; i++) {
            arrayLimas[i] = new Limas();
            System.out.println("Limas ke-" + (i+1));
            System.out.print("Masukkan tinggi: ");
            arrayLimas[i].tinggi = sc.nextInt();
            System.out.print("Masukkan sisi: ");
            arrayLimas[i].sisi = sc.nextInt();
        }

        for (int i = 0; i < arrayBola.length; i++) {
            arrayBola[i] = new Bola();
            System.out.println("Bola ke-" + (i+1));
            System.out.print("Masukkan radius: ");
            arrayBola[i].radius = sc.nextInt();
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("\nKerucut ke-" + (i+1));
            System.out.println("Luas: " + arrayKerucut[i].hitungLuas());
            System.out.println("Volume: " + arrayKerucut[i].hitungVolume());
            System.out.println("\nLimas ke-" + (i+1));
            System.out.println("Luas: " + arrayLimas[i].hitungLuas());
            System.out.println("Volume: " + arrayLimas[i].hitungVolume());
            System.out.println("\nBola ke-" + (i+1));
            System.out.println("Luas: " + arrayBola[i].hitungLuas());
            System.out.println("Volume: " + arrayBola[i].hitungVolume());
        }
    }
}
