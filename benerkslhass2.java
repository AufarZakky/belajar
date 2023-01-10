import java.util.Scanner;

public class benerkslhass2 {

    private static String reverse(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r += s.charAt(s.length() - 1 - i);
        }

        return r;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputKalimat = input.nextLine();
        String kataTambahan = input.nextLine();
        String[] tempKata = inputKalimat.split(" ");
        String result = "";
        for (int i = 0; i < tempKata.length; i++) {
            if((i+1) % 2 == 0) {
                tempKata[i] = reverse(tempKata[i]);
            }
            tempKata[i] = tempKata[i] + kataTambahan;
        }

        result = String.join(" ",tempKata);
        System.out.println(result);
    }
}