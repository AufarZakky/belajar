import java.util.Scanner;

public class Tessoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama = sc.nextLine();
        String gol = sc.nextLine();
        int jam = sc.nextInt();

        switch (gol) {
            case "A":
                int upah = 5000;
                if (jam >= 48) {
                    int lembur = (jam - 48) * 4000 + (upah * 48);
                    System.out.println(lembur);
                } else {
                    System.out.println(upah * 48);
                }
                break;
            case "B":
                int upah1 = 7000;
                if (jam >= 48) {
                    int lembur = (jam - 48) * 4000 + (upah1 * 48);
                    System.out.println(lembur);
                } else {
                    System.out.println(upah1 * 48);
                }
                break;
            case "C":
                int upah2 = 8000;
                if (jam >= 48) {
                    int lembur = (jam - 48) * 4000 + (upah2 * 48);
                    System.out.println(lembur);
                } else {
                    System.out.println(upah2 * 48);
                }
                break;
            case "D":
                int upah3 = 10000;
                if (jam >= 48) {
                    int lembur = (jam - 48) * 4000 + (upah3 * 48);
                    System.out.println(lembur);
                } else {
                    System.out.println(upah3 * 48);
                }
                break;

        }
    }
}
