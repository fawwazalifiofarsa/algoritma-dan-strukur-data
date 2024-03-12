package Jobsheet3;

import java.util.Scanner;

public class Mahasiswa {
    String nama;
    int nim;
    char jenisKelamin;
    double ipk;

    public static void averageIpk(Mahasiswa[] arrayMahasiswa) {
        double averageIpk = 0;
        for (Mahasiswa mahasiswa : arrayMahasiswa) {
            averageIpk += mahasiswa.ipk;
        }
        System.out.println("Rata - rata IPK: " + Math.round((averageIpk / 3) * 100) / 100.0);
    }

    public static void IpkTerbesar(Mahasiswa[] arrayMahasiswa) {
        Mahasiswa mahasiswaTertinggi = arrayMahasiswa[0];
        for (Mahasiswa mahasiswa : arrayMahasiswa) {
            if (mahasiswa.ipk > mahasiswaTertinggi.ipk) {
                mahasiswaTertinggi = mahasiswa;
            }
        }
        System.out.println("Mahasiswa dengan IPK tertinggi:");
        System.out.println("Nama: " + mahasiswaTertinggi.nama);
        System.out.println("Jenis Kelamin: " + mahasiswaTertinggi.jenisKelamin);
        System.out.println("IPK: " + mahasiswaTertinggi.ipk);
    }

    public static void main(String[] args) {
        Mahasiswa[] arrayMahasiswa = new Mahasiswa[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            arrayMahasiswa[i] = new Mahasiswa();
            System.out.print("Masukkan nama: ");
            arrayMahasiswa[i].nama = sc.next();
            System.out.print("Masukkan nim: ");
            arrayMahasiswa[i].nim = sc.nextInt();
            System.out.print("Masukkan jenis kelamin: ");
            arrayMahasiswa[i].jenisKelamin = sc.next().charAt(0);
            System.out.print("Masukkan IPK: ");
            arrayMahasiswa[i].ipk = sc.nextDouble();
        }

        for (int i = 0; i < arrayMahasiswa.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.println("nama: " + arrayMahasiswa[i].nama);
            System.out.println("nim: " + arrayMahasiswa[i].nim);
            System.out.println("jenis kelamin: " + arrayMahasiswa[i].jenisKelamin);
            System.out.println("IPK: " + arrayMahasiswa[i].ipk);
        }
        averageIpk(arrayMahasiswa);
        IpkTerbesar(arrayMahasiswa);
    }
    
}