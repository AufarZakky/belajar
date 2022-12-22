import java.util.Arrays;
import java.util.Scanner;

public class ArrayUrut {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int awal = sc.nextInt();

       int[] angka = new int[awal];
       for (int i = 0; i < angka.length; i++) {
        angka[i] = sc.nextInt();
       }

       Arrays.sort(angka);

       int jumlah = 0;
       for (int i = 0; i < angka.length; i++) {
        System.out.println(angka[i]);
       }
    }
}
