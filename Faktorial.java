import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        System.out.println(faktorial(x));
    }
        private static int faktorial(int x) {
            if (x == 0) {
                return 1;
            } else {
                return x * faktorial(x-1);
            }
            
        }
    
}
