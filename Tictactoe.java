import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] papan = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                papan[i][j]= sc.nextInt();
            }
        }
        int jumlah = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (papan[j][i] == 1) jumlah++ 
                    
                
            }
        }
    }
}
