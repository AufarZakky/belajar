import java.util.Scanner;

public class permen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toples = input.nextInt();
        int permen = input.nextInt();
        int[] masukan = new int [toples];

        for (int i = 0; i < toples; i++) {
            masukan[i] = input.nextInt();
        }
        for (int i = 0; i < masukan.length; i++) {
            for (int j = i + 1; j < masukan.length; j++) {
                int jmlpermen = masukan[j] + masukan[i];
                if (jmlpermen == permen) {
                    System.out.println((i +  1) + " " + (j + 1));
                }
                else {
                    continue;
                }
            }
        }
    }
}
