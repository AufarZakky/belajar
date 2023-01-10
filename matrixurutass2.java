import java.util.Scanner;

public class matrixurutass2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Membaca jumlah baris dan kolom dari matrix

    System.out.println("Masukkan jumlah baris & kolom:");
    int angka = scanner.nextInt();
    int baris = angka;
    int kolom = angka;

    // Membuat array 2D untuk menampung matrix
    int[][] matrix = new int[baris][kolom];

    // Membaca isi matrix dari input
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    // Menampilkan matrix sebelum diurutkan
    System.out.println("Matrix sebelum diurutkan:");
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    // Mengurutkan isi matrix
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        for (int k = 0; k < baris; k++) {
          for (int l = 0; l < kolom; l++) {
            if (matrix[i][j] < matrix[k][l]) {
              int temp = matrix[i][j];
              matrix[i][j] = matrix[k][l];
              matrix[k][l] = temp;
            }
          }
        }
      }
    }

    // Menampilkan matrix setelah diurutkan
    System.out.println("Matrix setelah diurutkan:");
    for (int i = 0; i < baris; i++) {
      for (int j = 0; j < kolom; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    scanner.close();
  }
}
