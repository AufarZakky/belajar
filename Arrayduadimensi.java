import java.util.Scanner;

public class Arrayduadimensi {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Masukkan baris dan kolom : "); 
       int baris = sc.nextInt();
       int kolom = sc.nextInt();
       int[][] matrix = new int [baris][kolom];

       System.out.print("Masukkan matriks nya : ");
       for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matrix[i][j] = sc.nextInt();
            }
       }
       System.out.println("Matriks yang diinputkan: ");
       for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
       }
    }
}
