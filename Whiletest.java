import java.util.Scanner;

public class Whiletest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = 0;
        int total = 0;

        while ((angka = sc.nextInt()) != 0 ) {
            total += angka;
        }
        System.out.println(total);
    }
}
