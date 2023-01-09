import java.util.Scanner;

public class Matrix2D {
    public static void main(String[] args) {
        // Nama : Aufar Hadni Azzakky
        // NIm : 6706223109
       Scanner sc = new Scanner(System.in);
       System.out.println("Masukkan baris dan kolom : "); 
       int baris = sc.nextInt();
       int kolom = sc.nextInt();
       int[][] matrix = new int [baris][kolom];

       System.out.println("Masukkan matriks nya : ");
       for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                matrix[i][j] = sc.nextInt();
            }
       }
       System.out.println("Matrix yang diinput: ");
       for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
       }
    }
}
