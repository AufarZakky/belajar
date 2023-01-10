import java.util.Scanner;

public class slahkbnarass2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine() + " ";
        String hasil = kalimat.replaceAll("[AIUEOaiueo]" + "[BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz] ", " ");;
        
        System.out.println(hasil);
    }
}
