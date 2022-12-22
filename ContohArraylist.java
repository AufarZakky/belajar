import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContohArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        ArrayList<Integer> angka = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            angka.add(sc.nextInt());
        }
        Collections.sort(angka);

        for (int i = 0; i < angka.size(); i++) {
            System.out.println(angka.get(i));
        }
    }
}
