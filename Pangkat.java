import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        int pangkat = sc.nextInt();
        System.out.println(Result(angka, pangkat));
        // a*2 = a + a
        // a*3 = a + a + a
        // a*4 =
    }

    private static int Result(int angka, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else {
            return angka * Result(angka, pangkat - 1);
        }
    }
}    