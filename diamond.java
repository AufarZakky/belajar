import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = angka-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = angka-1; i >= 1; i--) {
            for (int j = angka-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i*2-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}