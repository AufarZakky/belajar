import java.util.Scanner;

public class ContohArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int awal = sc.nextInt();

       int[] angka = new int[awal];
       for (int i = 0; i < angka.length; i++) {
        angka[i] = sc.nextInt();
       }

       int jumlah = 0;
       for (int i = 0; i < angka.length; i++) {
        jumlah += angka[i];   
       }
       System.out.println(jumlah);
    }
}
