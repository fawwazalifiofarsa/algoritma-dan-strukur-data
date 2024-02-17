import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        String nim;
        System.out.print("Input NIM: ");
        nim = input.next();
        n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 || i == 6 || i == 10) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
