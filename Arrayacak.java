import java.util.ArrayList;
import java.util.Scanner;

public class Arrayacak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> simpanan = new ArrayList<String>();
        int n = input.nextInt();
        int len = n;
        for (int i = 0; i < len; i++) {
            String kalimat = input.next(); 
            simpanan.add(kalimat);
        }

        if(n % 2 != 0) {
            len = n - 1;
        }

        for (int i = 1; i < len; i+=2) {
            String temp = simpanan.get(i-1);
            simpanan.set(i-1, simpanan.get(i));
            simpanan.set(i, temp);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(simpanan.get(i));
        }
   }
}