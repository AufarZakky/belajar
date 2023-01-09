import java.util.Scanner;

public class Latihanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris = sc.nextInt();
        int kolom = baris;
        int angka = sc.nextInt();

        int[][] matrix = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
              hasil[i][j] = matrix[i][j] * angka;
              System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}