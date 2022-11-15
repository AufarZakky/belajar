import java.util.Scanner;

public class fpb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1 = sc.nextInt();
        int bil2 = sc.nextInt();

        System.out.println(fpb(bil1, bil2));
    }
    private static int fpb(int bil1, int bil2) {
        if (bil2 == 0) {
            return bil1;
        } else {
            return fpb(bil2, bil1 % bil2);
        }
    }
}
