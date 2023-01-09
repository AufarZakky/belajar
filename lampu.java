import java.util.Scanner;

public class lampu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        int[] saklar = new int[angka];
        
        String kondisi1 = "" , kondisi2 = "";
        for (int i = 0; i < angka; i++) {
            saklar[i] = sc.nextInt();
        }

        for (int i = 0; i < saklar.length; i++) {
            switch (saklar[i % 4]) {
                case 0:
                    kondisi1 = "MATI";
                    kondisi2 = "MATI";
                    break;
                case 1:
                    kondisi1 = "HIDUP";
                    kondisi2 = "MATI";
                    break;
                case 2:
                    kondisi1 = "HIDUP";
                    kondisi2 = "HIDUP";
                    break;
                case 3:
                    kondisi1 = "MATI";
                    kondisi2 = "HIDUP";
                    break;
            }
            System.out.println(kondisi1 + " " + kondisi2);
        }
    }
}
