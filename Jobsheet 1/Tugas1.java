import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char kodeInput;
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char[][] kota = {
            { 'B', 'A', 'N', 'T', 'E', 'N', '\0', '\0', '\0', '\0', '\0', '\0' },
            { 'J', 'A', 'K', 'A', 'R', 'T', 'A', '\0', '\0', '\0', '\0', '\0' },
            { 'B', 'A', 'N', 'D', 'U', 'N', 'G', '\0', '\0', '\0', '\0', '\0' },
            { 'C', 'I', 'R', 'E', 'B', 'O', 'N', '\0', '\0', '\0', '\0', '\0' },
            { 'B', 'O', 'G', 'O', 'R', '\0', '\0', '\0', '\0', '\0', '\0', '\0' },
            { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', '\0', '\0' },
            { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', '\0', '\0', '\0', '\0' },
            { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', '\0', '\0', '\0', '\0' },
            { 'M', 'A', 'L', 'A', 'N', 'G', '\0', '\0', '\0', '\0', '\0', '\0' },
            { 'T', 'E', 'G', 'A', 'L', '\0', '\0', '\0', '\0', '\0', '\0', '\0' }
        };
        System.out.print("Input kode: ");
        kodeInput = input.next().charAt(0);
        for (int i = 0; i < kode.length; i++) {
            if (kodeInput == kode[i]) {
                for (int j = 0; j < kota.length; j++) {
                    System.out.print(kota[i][j] + " ");
                }
                break;
            }
            if (kodeInput != kode[i] && i == kode.length-1) {
                System.out.println("Input tidak valid.");
            }
        }
    }
}
