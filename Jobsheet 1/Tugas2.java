import java.util.Scanner;

public class Tugas2 {
    public static Scanner input = new Scanner(System.in);

    public static void menu(double v, double s, double t) {
        double total = 0;
        int opsi;
        System.out.println("\nMenu: ");
        System.out.println("1. Rumus Kecepatan");
        System.out.println("2. Rumus Jarak");
        System.out.println("3. Rumus Waktu");
        System.out.print("Pilih Opsi: ");
        opsi = input.nextInt();
        switch (opsi) {
            case 1:
                total = kecepatan(s, t);
                break;
            case 2:
                total = jarak(v, t);
                break;
            case 3:
                total = waktu(s, v);
                break;
            default:
                System.out.println("Opsi tidak valid");
                break;
        }
        System.out.printf("Total: %s", total);
    }

    public static double kecepatan(double s, double t) {
        return s / t;
    }

    public static double jarak(double v, double t) {
        return v * t;
    }

    public static double waktu(double s, double v) {
        return s / v;
    }

    public static void main(String[] args) {
        double v = 0, s = 0, t = 0;
        System.out.print("Input v: ");
        v = input.nextDouble();
        System.out.print("Input s: ");
        s = input.nextDouble();
        System.out.print("Input t: ");
        t = input.nextDouble();
        menu(v, s, t);
    }
}
