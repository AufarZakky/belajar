import java.util.Scanner;

public class ass2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int angka = sc.nextInt();
    
    int[] duaKeluaran = new int[angka * 2];
  
    for (int i = 0; i < angka * 2; i++) {
      duaKeluaran[i] = sc.nextInt();
      int bilangan = duaKeluaran[i];
      int a, b = 0;
      do {
        a = bilangan % 10;
        b = b * 10 + a;
        bilangan = bilangan / 10;
      } while (bilangan > 0);
      duaKeluaran[i] = b;
    }
  
    for (int i = 0; i < angka * 2; i += 2) {
      System.out.print(duaKeluaran[i] + duaKeluaran[i + 1] + " ");
    }
  }
}