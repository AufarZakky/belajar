import java.util.Scanner;

public class SapaNama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama1 = scan.nextLine();
        String nama2 = scan.nextLine();

        hai(nama1);
        hai(nama2);
    }
    private static void hai(String nama) {
        System.out.println("Hai " + nama + ". Semangat pagi!");
    }
}
